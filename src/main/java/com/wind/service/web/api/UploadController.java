package com.wind.service.web.api;

import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @ApiOperation(value = "上传xls表格")
    @PostMapping("/xls")
    public ResponseEntity<?> xls(@RequestParam("file") MultipartFile file) throws Exception {
        File path = checkDir();
        String fileName = file.getOriginalFilename();
        File uploadPath = new File(path.getAbsoluteFile(), fileName);
        file.transferTo(uploadPath);
        FileInputStream is = new FileInputStream(uploadPath.getAbsoluteFile());

        Workbook wb;
        //根据文件名判断文件是2003版本还是2007版本
        if (fileName.toLowerCase().matches("^.+\\.(?i)(xlsx)$")) {
            wb = new XSSFWorkbook(is);
        } else {
            wb = new HSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);
        int totalRows = sheet.getPhysicalNumberOfRows();
        int totalCells = 0;
        if (totalRows > 0 && sheet.getRow(0) != null) {
            totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
        }
        LinkedList<String> list = new LinkedList<>();
        for (int r = 0; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            for (int c = 0; c < totalCells; c++) {
                Cell cell = row.getCell(c);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    String value = cell.getStringCellValue().trim();
                    if (value.matches("^[1][3,4,5,7,8][0-9]{9}$"))
                    {
                        list.add(value);
                    }
                }
            }
        }
        return ResponseEntity.ok().body(list);
    }

    private File checkDir() throws Exception {
        File path = new File(ResourceUtils.getURL("classpath:").getPath(), "upload");
        if (!path.exists()) path.mkdirs();
        return path;
    }
}

package com.wind.service.common;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Accessors(chain = true)
@NoArgsConstructor
@Data
@ToString
public class PaginatedResult implements Serializable {
    private int currentPage; // Current page number
    private int count; // Number of total result
    private Object data; // Paginated resources
}

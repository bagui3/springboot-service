package com.wind.service.exception;

import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
public class ResourceNotFoundException extends RuntimeException {

    private Long id;

    @Override
    public String getMessage() {
        return "id " + id + " is not found.";
    }
}

package com.example.withcommuback.common.error.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponseVO {
    private String code;
    private String message;
}

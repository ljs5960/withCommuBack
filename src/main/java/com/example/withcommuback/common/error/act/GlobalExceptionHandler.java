package com.example.withcommuback.common.error.act;

import com.example.withcommuback.common.error.vo.ErrorResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    protected ResponseEntity<?> handleNoSuchElementFoundException(Exception e) {
        final ErrorResponseVO errorResponsevo = ErrorResponseVO.builder()
                .code("Not Found")
                .message(e.getMessage()).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponsevo);
    }
}
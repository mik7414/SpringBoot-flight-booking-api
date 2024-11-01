package com.springboot.handlers;


import com.springboot.exceptions.InsufficientAccountBalance;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InsufficientAccountBalance.class)
    public ResponseEntity<Map<String, String>> handleInsufficientAccountBalance(InsufficientAccountBalance ex) {
        Map<String, String> errorMessages = new HashMap<>();
        errorMessages.put("Error", ex.getMessage());
        return new ResponseEntity<>(errorMessages, HttpStatus.FORBIDDEN);
    }
}

package com.example.Management.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    ResponseEntity<String> handleRuntimeException(RuntimeException e){
        return ResponseEntity.internalServerError().body(e.getMessage());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e){
        String errorMessage = e.getConstraintViolations().stream()
                .map(violation -> violation.getMessage())
                .findFirst()
                .orElse("Invalid data");
        return ResponseEntity.badRequest().body(errorMessage);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    ResponseEntity<String> DataIntegrityViolationException(DataIntegrityViolationException e){
        return ResponseEntity.internalServerError().body(e.getMessage());
    }
}

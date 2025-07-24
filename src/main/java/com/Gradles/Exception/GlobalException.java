package com.Gradles.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String>handleException(MethodArgumentNotValidException ex){
        String errorsms= ex.getBindingResult().getFieldError().getDefaultMessage();
        return ResponseEntity.badRequest().body(errorsms);
    }
}

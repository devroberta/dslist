package com.devroberta.handler;

import com.devroberta.exception.BadRequestExceptionDetails;
import com.devroberta.exception.GameNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(GameNotFound.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerGameNotFound(GameNotFound exception){
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Game Not Found")
                .details(exception.getMessage())
                .message(exception.getClass().getName())
                .build(), HttpStatus.NOT_FOUND);
    }
}

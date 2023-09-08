package com.example.weathermapapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(DateOutOfRangeException.class)
    public ResponseEntity<String> handleDateOutOfRangeException(DateOutOfRangeException exception) {
        String errorMessage = exception.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(OneOfDatesIsNullException.class)
    public ResponseEntity<String> handleOneOfDatesIsNullException(OneOfDatesIsNullException exception) {
        String errorMessage = exception.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CityNameIsNullException.class)
    public ResponseEntity<String> handleCityNameIsNullException(CityNameIsNullException exception) {
        String errorMessage = exception.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CityDoesNotExistException.class)
    public ResponseEntity<String> handleCityDoesNotExistException(CityDoesNotExistException exception) {
        String errorMessage = exception.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}

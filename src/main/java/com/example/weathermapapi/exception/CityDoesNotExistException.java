package com.example.weathermapapi.exception;

public class CityDoesNotExistException extends RuntimeException
{
    public CityDoesNotExistException (String message)
    {
        super(message);
    }
}

package com.example.weathermapapi.exception;

public class CityNameIsNullException extends RuntimeException
{
    public CityNameIsNullException (String message)
    {
        super(message);
    }
}

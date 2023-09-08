package com.example.weathermapapi.exception;

public class OneOfDatesIsNullException extends RuntimeException
{
    public OneOfDatesIsNullException (String message)
    {
        super(message);
    }
}

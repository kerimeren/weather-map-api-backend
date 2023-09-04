package com.example.weathermapapi.exception;
public class DateOutOfRangeException extends RuntimeException
{
    public DateOutOfRangeException (String message)
    {
        super(message);
    }
}

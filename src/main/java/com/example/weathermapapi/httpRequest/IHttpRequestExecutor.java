package com.example.weathermapapi.httpRequest;

public interface IHttpRequestExecutor
{
    <T> T executeGetRequest(String url, Class<T> resultClass);
}

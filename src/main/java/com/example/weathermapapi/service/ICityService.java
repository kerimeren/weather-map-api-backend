package com.example.weathermapapi.service;

import com.example.weathermapapi.exception.CityDoesNotExistException;
import com.example.weathermapapi.model.City;

public interface ICityService
{
    void fetchAndSaveCity(String name);
    City findCityByName(String name);
}

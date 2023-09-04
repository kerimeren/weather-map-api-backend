package com.example.weathermapapi.service;

import com.example.weathermapapi.model.City;

public interface ICityService
{
    void fetchAndSaveCity(String name);
    void saveCity(City city);
    City findCityByName(String name);
}

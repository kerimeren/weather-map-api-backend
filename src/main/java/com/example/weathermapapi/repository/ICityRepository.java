package com.example.weathermapapi.repository;

import com.example.weathermapapi.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ICityRepository extends JpaRepository<City, Long>
{
    City findCityByName(String name);
    City findCityByLatAndLon(float lat, float lon);

    Boolean existsByName(String name);
}


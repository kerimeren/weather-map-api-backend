package com.example.weathermapapi.repository;

import com.example.weathermapapi.model.City;
import com.example.weathermapapi.model.Pollution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IPollutionRepository extends JpaRepository<Pollution, Long>
{

    List<Pollution> findAllByCityAndDate(City city, LocalDate date);

    Boolean existsByCityAndDate(City city, LocalDate date);
}

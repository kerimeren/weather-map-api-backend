package com.example.weathermapapi.service;
import com.example.weathermapapi.dto.AnswerDto;

import java.time.LocalDate;

public interface IPollutionService
{
    AnswerDto getResults(String cityName, LocalDate startDate, LocalDate endDate);
}

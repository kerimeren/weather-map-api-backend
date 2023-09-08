package com.example.weathermapapi.controller;

import com.example.weathermapapi.dto.AnswerDto;
import com.example.weathermapapi.exception.CityNameIsNullException;
import com.example.weathermapapi.exception.OneOfDatesIsNullException;
import com.example.weathermapapi.service.IPollutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api/pollutions")
@RequiredArgsConstructor
public class PollutionController
{
    private final IPollutionService pollutionService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public ResponseEntity<AnswerDto> getResults (@RequestParam String cityName,
                                                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate start,
                                                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate end
                                                ) throws OneOfDatesIsNullException, CityNameIsNullException
    {
        if(cityName.isEmpty())
        {
            throw new CityNameIsNullException("City name cannot be null!");
        }
        if(start == null && end == null)
        {
            end = LocalDate.now();
            start = end.minusDays(6);
        }
        else if (start == null || end == null)
        {
            throw new OneOfDatesIsNullException("One of the dates cannot be null!");
        }

        return ResponseEntity.ok(pollutionService.getResults(cityName, start, end));
    }
}


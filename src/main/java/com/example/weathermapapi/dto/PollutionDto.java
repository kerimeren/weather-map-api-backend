package com.example.weathermapapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.weathermapapi.model.City;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PollutionDto
{
    private Long id;
    private City city;
    private LocalDate date;
    private String co;
    private String so2;
    private String o3;
}

package com.example.weathermapapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PollutionValuesDto
{
    private PollutionElementsDto components;
    private Long dt;
}
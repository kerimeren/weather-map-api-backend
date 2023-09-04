package com.example.weathermapapi.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerDto
{
    private String city;
    private List<ResultDto> results;
}

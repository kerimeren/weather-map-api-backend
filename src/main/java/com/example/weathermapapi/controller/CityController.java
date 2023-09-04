package com.example.weathermapapi.controller;


import com.example.weathermapapi.service.ICityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cities")
@RequiredArgsConstructor
public class CityController
{
    private final ICityService cityService;
    @GetMapping
    public ResponseEntity<Void> fetchAndSaveCity(@RequestParam String name)
    {
        cityService.fetchAndSaveCity(name);
        return ResponseEntity.ok().build();
    }
}

package com.example.weathermapapi.service;

import com.example.weathermapapi.dto.CityDto;
import com.example.weathermapapi.exception.CityDoesNotExistException;
import com.example.weathermapapi.repository.ICityRepository;
import com.example.weathermapapi.httpRequest.IHttpRequestExecutor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.weathermapapi.model.City;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class CityService implements ICityService
{
    private static final String APP_ID = "ce615b45850cd320186740aa1d646eda";
    private static final String API_CITY_URL = "http://api.openweathermap.org/geo/1.0/direct?q=%s&limit=5&appid=%s";
    private final IHttpRequestExecutor httpRequestExecutor;
    private final ICityRepository cityRepository;

    @Override
    public void fetchAndSaveCity(String name)
    {
        if(!cityRepository.existsByName(name))
        {
            CityDto cityDto = fetchCity(name);
            log.info("The city {} is fetched from the API", name);
            City city = City.builder()
                    .name(name)
                    .lat(cityDto.getLat())
                    .lon(cityDto.getLon())
                    .build();
            cityRepository.save(city);
        }
    }

    @Override
    public City findCityByName(String name)
    {
        return cityRepository.findCityByName(name);
    }

    private CityDto fetchCity(String cityName) throws CityDoesNotExistException
    {
        String url = String.format(API_CITY_URL, cityName, APP_ID);
        List<CityDto> cityDtoList = Arrays.stream(httpRequestExecutor.executeGetRequest(url, CityDto[].class)).toList();
        if(cityDtoList.size() == 0)
        {
            throw new CityDoesNotExistException("There is no city with the specified name!");
        }
        return cityDtoList.get(0);
    }
}


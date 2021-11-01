package com.bootcamp.weathersql.controller;

import com.bootcamp.weathersql.service.LogService;
import com.bootcamp.weathersql.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final LogService logService;
    private final WeatherService weatherService;

    public LogController(LogService logService, WeatherService weatherService) {
        this.logService = logService;
        this.weatherService = weatherService;
    }



}

package com.example.cine.controller;

import com.example.cine.entity.ScheduleEntity;
import com.example.cine.model.ScheduleDto;
import com.example.cine.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createSchedule(@RequestBody ScheduleDto scheduleDto) {
        scheduleService.createSchedule(scheduleDto);
    }

    @GetMapping("/getClient/{idSchedule}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ScheduleEntity requestSchedule(@PathVariable Integer idSchedule) {
        return scheduleService.getScheduleById(idSchedule);
    }

}

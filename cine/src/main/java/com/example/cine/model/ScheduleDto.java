package com.example.cine.model;

import lombok.Data;

import java.util.List;

@Data
public class ScheduleDto {

    private Integer idMovie;
    private List<String> schedule;

}

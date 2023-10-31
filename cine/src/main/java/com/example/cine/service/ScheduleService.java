package com.example.cine.service;

import com.example.cine.entity.MovieEntity;
import com.example.cine.entity.ScheduleEntity;
import com.example.cine.model.ScheduleDto;
import com.example.cine.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public void createSchedule(ScheduleDto scheduleDto) {
        for (String schedule : scheduleDto.getSchedule()) {
            ScheduleEntity scheduleEntity = new ScheduleEntity();
            scheduleEntity.setSchedule(schedule);
            scheduleEntity.setMovieEntity(new MovieEntity());
            scheduleEntity.getMovieEntity().setIdMovie(scheduleDto.getIdMovie());
            scheduleRepository.save(scheduleEntity);
        }
    }

    public ScheduleEntity getScheduleById(Integer idSchedule) {
        return scheduleRepository.findById(idSchedule).orElse(null);
    }
}

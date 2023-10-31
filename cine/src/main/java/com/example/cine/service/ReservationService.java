package com.example.cine.service;

import com.example.cine.entity.ClientEntity;
import com.example.cine.entity.MovieEntity;
import com.example.cine.entity.ReservationEntity;
import com.example.cine.entity.ScheduleEntity;
import com.example.cine.model.ReservationDto;
import com.example.cine.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public void createReservation(ReservationDto reservationDto) {

        ClientEntity clientEntity = new ClientEntity();
        MovieEntity movieEntity = new MovieEntity();
        ScheduleEntity scheduleEntity = new ScheduleEntity();
        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setTicketQuantity(reservationDto.getTicketQuantity());
        clientEntity.setIdClient(reservationDto.getIdClient());
        reservationEntity.setClientEntity(clientEntity);
        movieEntity.setIdMovie(reservationDto.getIdMovie());
        reservationEntity.setMovieEntity(movieEntity);
        scheduleEntity.setIdSchedule(reservationDto.getIdSchedule());
        reservationEntity.setScheduleEntity(scheduleEntity);
        reservationRepository.save(reservationEntity);
    }

    public ReservationEntity getReservationById(Integer idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}

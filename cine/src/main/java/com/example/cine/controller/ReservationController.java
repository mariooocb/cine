package com.example.cine.controller;

import com.example.cine.entity.ReservationEntity;
import com.example.cine.model.ReservationDto;
import com.example.cine.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/create/reservation")
    @ResponseStatus(HttpStatus.CREATED)
    private void createReservation(@RequestBody ReservationDto reservationDto) {
        reservationService.createReservation(reservationDto);
    }

    @GetMapping("/getReservation/{idReservation}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ReservationEntity requestReservation(@PathVariable Integer idReservation) {
        return reservationService.getReservationById(idReservation);
    }

}

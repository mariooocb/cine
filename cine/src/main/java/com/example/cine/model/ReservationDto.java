package com.example.cine.model;

import lombok.Data;

@Data
public class ReservationDto {

    private Integer idClient;
    private Integer idMovie;
    private Integer idSchedule;
    private Integer ticketQuantity;

}

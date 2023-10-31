package com.example.cine.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Data
@Table(name = "reservation")
public class ReservationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reservation")
    private Integer idReservation;

    @OneToOne
    @JoinColumn(name = "id_movie")
    private MovieEntity movieEntity;

    @OneToOne
    @JoinColumn(name = "id_schedule")
    private ScheduleEntity scheduleEntity;

    @OneToOne
    @JoinColumn(name = "id_client")
    private ClientEntity clientEntity;

    @Column(name = "ticket_quantity")
    private Integer ticketQuantity;

}

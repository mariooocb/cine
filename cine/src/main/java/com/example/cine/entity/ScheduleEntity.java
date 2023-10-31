package com.example.cine.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "schedule")
public class ScheduleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_schedule")
    private Integer idSchedule;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private MovieEntity movieEntity;

    @Column(name = "schedule")
    private String schedule;

}

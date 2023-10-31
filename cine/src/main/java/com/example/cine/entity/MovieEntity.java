package com.example.cine.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "movie")
public class MovieEntity implements Serializable {

    @Id
    @Column(name = "id_movie")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idMovie;

    @Column(name = "tittle")
    private String tittle;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "duration")
    private String duration;

    @Column(name = "description")
    private String description;

    @Column(name = "classification")
    private String classification;

    @OneToOne
    @JoinColumn(name = "id_gender")
    private GenderEntity genderEntity;

    @Column(name = "country")
    private String country;

    @Column(name = "active")
    private String active;

}

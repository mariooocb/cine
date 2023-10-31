package com.example.cine.model;

import lombok.Data;

import java.util.Date;

@Data
public class MovieDto {

    private Integer idMovie;
    private String tittle;
    private String releaseDate;
    private String duration;
    private String description;
    private String classification;
    private Integer idGender;
    private String active;
    private String country;

}

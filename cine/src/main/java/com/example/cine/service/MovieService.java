package com.example.cine.service;

import com.example.cine.entity.GenderEntity;
import com.example.cine.entity.MovieEntity;
import com.example.cine.model.MovieDto;
import com.example.cine.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public void createMovie(MovieDto movieDto) {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setReleaseDate(movieDto.getReleaseDate());
        movieEntity.setTittle(movieDto.getTittle());
        GenderEntity genderEntity = new GenderEntity();
        genderEntity.setIdGender(movieDto.getIdGender());
        movieEntity.setGenderEntity(genderEntity);
        movieEntity.setActive("S");
        movieEntity.setClassification(movieDto.getClassification());
        movieEntity.setDuration(movieDto.getDuration());
        movieEntity.setCountry(movieDto.getCountry());
        movieEntity.setDescription(movieDto.getDescription());
        movieRepository.save(movieEntity);
    }

    public MovieEntity getMovieById(Integer idMovie) {
        return movieRepository.findById(idMovie).orElse(null);
    }
}

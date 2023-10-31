package com.example.cine.controller;


import com.example.cine.entity.MovieEntity;
import com.example.cine.model.MovieDto;
import com.example.cine.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMovie(@RequestBody MovieDto movieDto) {
        movieService.createMovie(movieDto);
    }

    @GetMapping("/getMovie/{idMovie}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public MovieEntity requestMovie(@PathVariable Integer idMovie) {
        return movieService.getMovieById(idMovie);
    }

}
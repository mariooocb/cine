package com.example.cine.repository;

import com.example.cine.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository <MovieEntity,Integer> {

}

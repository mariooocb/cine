package com.example.cine.repository;

import com.example.cine.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity,Integer> {

}

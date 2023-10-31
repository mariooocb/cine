package com.example.cine.repository;

import com.example.cine.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientEntity,Integer> {

}

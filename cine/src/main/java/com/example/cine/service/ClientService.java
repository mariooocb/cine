package com.example.cine.service;

import com.example.cine.entity.ClientEntity;
import com.example.cine.model.ClientDto;
import com.example.cine.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void createClient(ClientDto clientDto) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName(clientDto.getName());
        clientEntity.setMail(clientDto.getMail());
        clientEntity.setAge(clientDto.getAge());
        clientRepository.save(clientEntity);
    }

    public ClientEntity getClientById(Integer idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }
}

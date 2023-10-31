package com.example.cine.controller;

import com.example.cine.entity.ClientEntity;
import com.example.cine.model.ClientDto;
import com.example.cine.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    private void createClient(@RequestBody ClientDto clientDto) {
        clientService.createClient(clientDto);
    }

    @GetMapping("/getClient/{idClient}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientEntity requestClient(@PathVariable Integer idClient) {
        return clientService.getClientById(idClient);
    }

}

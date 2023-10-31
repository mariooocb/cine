package com.example.cine.controller;

import com.example.cine.entity.GenderEntity;
import com.example.cine.repository.GenderRepository;
import com.example.cine.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gender")
public class GenderController {
    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private GenderService genderService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    private void createGender(@RequestParam String nameGender) {
        genderService.createGender(nameGender);
    }

    @GetMapping("/getGender/{idGender}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public GenderEntity requestGender(@PathVariable Integer idGender) {
        return genderService.getGenderById(idGender);
    }

}

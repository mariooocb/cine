package com.example.cine.service;

import com.example.cine.entity.GenderEntity;
import com.example.cine.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {
    @Autowired
    private GenderRepository genderRepository;

    public void createGender(String nameGender) {
        GenderEntity genderEntity = new GenderEntity();
        genderEntity.setNameGender(nameGender);
        genderRepository.save(genderEntity);
    }

    public GenderEntity getGenderById(Integer idGender) {
        return genderRepository.findById(idGender).orElse(null);
    }
}

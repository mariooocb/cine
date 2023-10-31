package com.example.cine.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "gender")
public class GenderEntity implements Serializable {

    @Id
    @Column(name = "id_gender")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idGender;

    @Column(name = "name_gender")
    private String nameGender;

}

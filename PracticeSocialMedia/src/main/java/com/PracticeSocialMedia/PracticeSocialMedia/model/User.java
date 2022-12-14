package com.PracticeSocialMedia.PracticeSocialMedia.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String birthDate;
    @NotNull
    private String email;
    @NotNull
    private String job;
    @NotNull
    private String country;
    @NotNull
    private String password;
}

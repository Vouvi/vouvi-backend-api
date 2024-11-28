package com.vouvi.api.models;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "password_user")
    private String passwordUser;

    @Column(name = "cep_user")
    private int cepUser;

    @Column(name = "birthdate_user")
    private Date birthdateUser;

    @Column(name = "gender_user")
    private String genderUser;

    @Column(name = "pronoun_user")
    private String pronounUser;

    @Column(name = "username")
    private String username;

    @Column(name = "name_user")
    private String nameUser;

    @Column(name = "lastname_user")
    private String lastnameUser;
}

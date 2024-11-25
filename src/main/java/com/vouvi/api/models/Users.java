package com.vouvi.api.models;

import jakarta.persistence.*;

import java.util.Date;

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


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public int getCepUser() {
        return cepUser;
    }

    public void setCepUser(int cepUser) {
        this.cepUser = cepUser;
    }

    public Date getBirthdateUser() {
        return birthdateUser;
    }

    public void setBirthdateUser(Date birthdateUser) {
        this.birthdateUser = birthdateUser;
    }

    public String getGenderUser() {
        return genderUser;
    }

    public void setGenderUser(String genderUser) {
        this.genderUser = genderUser;
    }

    public String getPronounUser() {
        return pronounUser;
    }

    public void setPronounUser(String pronounUser) {
        this.pronounUser = pronounUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }
}

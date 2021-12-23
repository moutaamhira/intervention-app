package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "employes")
public class Employee {

    @PrimaryKey(autoGenerate = true)
    private int id ;
    private String login ;
    private String pwd;
    private String prenom ;
    private String nom ;
    private String email ;
    private boolean actif ;

    public Employee( String login, String pwd, String prenom, String nom, String email, boolean actif, int valsync) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.actif = actif;
        this.valsync = valsync;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }

    private int valsync;


}

package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class priorites {
    @PrimaryKey(autoGenerate = true)
    private int  id ;
    private String nom ;
    private int valsync ;

    public priorites(int id, String nom, int valsync) {
        this.id = id;
        this.nom = nom;
        this.valsync = valsync;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }
}


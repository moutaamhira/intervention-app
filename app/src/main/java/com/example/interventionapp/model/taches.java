package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.sql.Date;

@Entity
public class taches {
    @PrimaryKey(autoGenerate = true)
    private int id ;
private String refernce ;
    private String nom ;
private int duree ;
private int prixheure ;
    @TypeConverters({Converter.class})
private long dateaction ;
private int valsync ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRefernce() {
        return refernce;
    }

    public void setRefernce(String refernce) {
        this.refernce = refernce;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getPrixheure() {
        return prixheure;
    }

    public void setPrixheure(int prixheure) {
        this.prixheure = prixheure;
    }

    public long getDateaction() {
        return dateaction;
    }

    public void setDateaction(long dateaction) {
        this.dateaction = dateaction;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }

    public taches(int id, String refernce, String nom, int duree, int prixheure, long dateaction, int valsync) {
        this.id = id;
        this.refernce = refernce;
        this.nom = nom;
        this.duree = duree;
        this.prixheure = prixheure;
        this.dateaction = dateaction;
        this.valsync = valsync;
    }
}


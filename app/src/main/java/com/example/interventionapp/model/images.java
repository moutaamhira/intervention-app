package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity
public class images {
    @PrimaryKey(autoGenerate = true)
    private int  id ;
    private String nom ;
   private  String img ;
    @TypeConverters({Converter.class})
private long dateCapture ;
    private int valsync ;

    public images(int id, String nom, String img, long dateCapture, int valsync) {
        this.id = id;
        this.nom = nom;
        this.img = img;
        this.dateCapture = dateCapture;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getDateCapture() {
        return dateCapture;
    }

    public void setDateCapture(long dateCapture) {
        this.dateCapture = dateCapture;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }
}

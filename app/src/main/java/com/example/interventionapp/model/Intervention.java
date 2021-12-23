package com.example.interventionapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.TypeConverters;

import java.io.Serializable;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public  class Intervention implements Serializable {

    @ColumnInfo(name="title")
   public String title;
    @ColumnInfo(name="nom")

    public String nom ;
    @ColumnInfo(name="adresse")

    public String adresse;
    @ColumnInfo(name="datedebut")
    @TypeConverters({Converter.class})
    public long datedebut;
    @ColumnInfo(name="datefin")
    @TypeConverters({Converter.class})
    public long datefin;



    public String getTitle() {
        return this.title;
    }

    public String getNom() {
        return this.nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public long getDatedebut() {
        return this.datedebut;
    }

    public long getDatefin() {
        return this.datefin;
    }

    public Intervention(String title, String nom, String adresse, long datedebut, long datefin) {

        this.title = title;
        this.nom = nom;
        this.adresse = adresse;
        this.datedebut = datedebut;
        this.datefin = datefin;
    }


}

package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.sql.Date;

@Entity
public class contrats {
    @PrimaryKey(autoGenerate = true)
    private int  id ;
    @TypeConverters({Converter.class})
    private long datedebut ;
    @TypeConverters({Converter.class})
private long datefin ;
private Float redevence ;
    private int valsync ;

    public contrats(int id,long datedebut,long datefin, Float redevence, int valsync) {
        this.id = id;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.redevence = redevence;
        this.valsync = valsync;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(long datedebut) {
        this.datedebut = datedebut;
    }

    public long getDatefin() {
        return datefin;
    }

    public void setDatefin(long datefin) {
        this.datefin = datefin;
    }

    public Float getRedevence() {
        return redevence;
    }

    public void setRedevence(Float redevence) {
        this.redevence = redevence;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }
}


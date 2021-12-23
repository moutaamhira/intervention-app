package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity(foreignKeys = {@ForeignKey(entity = clients.class,
        parentColumns = "id",
        childColumns = "idclient",
        onDelete = ForeignKey.CASCADE)
})

public class sites {
    @PrimaryKey(autoGenerate = true) private int id ;
    private float longitude ;
    private float latitude ;
    private String adresse ;
    private String rue ;
    private int codepostal ;
    private String ville ;
    private String contact ;
    private String telcontact ;
    private int valsync ;
    private int idclient;

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public sites(float longitude,int idclient, float latitude, String adresse, String rue, int codepostal, String ville, String contact, String telcontact, int valsync) {
        this.id = id;
        this.idclient=idclient;
        this.longitude = longitude;
        this.latitude = latitude;
        this.adresse = adresse;
        this.rue = rue;
        this.codepostal = codepostal;
        this.ville = ville;
        this.contact = contact;
        this.telcontact = telcontact;
        this.valsync = valsync;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelcontact() {
        return telcontact;
    }

    public void setTelcontact(String telcontact) {
        this.telcontact = telcontact;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }
}

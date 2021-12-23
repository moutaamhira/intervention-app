package com.example.interventionapp.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity(foreignKeys = {@ForeignKey(entity = sites.class,
        parentColumns = "id",
        childColumns = "idSite",
        onDelete = ForeignKey.CASCADE)
})
public class interventions
{ @PrimaryKey(autoGenerate = true)
private int  id ;



    private String title ;
    @TypeConverters({Converter.class})
    private long datedebut ;
    @TypeConverters({Converter.class})
    private long datefin ;
    @TypeConverters({Converter.class})
    private long heuredebutplan ;
    @TypeConverters({Converter.class})
    private long heurefinplan ;
    private String commentaires ;
    @TypeConverters({Converter.class})
    private long dateplanification ;
    @TypeConverters({Converter.class})
    private long heuredebuteffect ;
    @TypeConverters({Converter.class})
    private long heurefineffect ;
    private Boolean terminee ;
    @TypeConverters({Converter.class})
    private long dateterminaison ;
    private Boolean validee ;
    @TypeConverters({Converter.class})
    private long datevalidation ;
    private int valsync ;
    private int idSite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public long getHeuredebutplan() {
        return heuredebutplan;
    }

    public void setHeuredebutplan(long heuredebutplan) {
        this.heuredebutplan = heuredebutplan;
    }

    public long getHeurefinplan() {
        return heurefinplan;
    }

    public void setHeurefinplan(long heurefinplan) {
        this.heurefinplan = heurefinplan;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public long getDateplanification() {
        return dateplanification;
    }

    public void setDateplanification(long dateplanification) {
        this.dateplanification = dateplanification;
    }

    public long getHeuredebuteffect() {
        return heuredebuteffect;
    }

    public void setHeuredebuteffect(long heuredebuteffect) {
        this.heuredebuteffect = heuredebuteffect;
    }

    public long getHeurefineffect() {
        return heurefineffect;
    }

    public void setHeurefineffect(long heurefineffect) {
        this.heurefineffect = heurefineffect;
    }

    public Boolean getTerminee() {
        return terminee;
    }

    public void setTerminee(Boolean terminee) {
        this.terminee = terminee;
    }

    public long getDateterminaison() {
        return dateterminaison;
    }

    public void setDateterminaison(long dateterminaison) {
        this.dateterminaison = dateterminaison;
    }

    public Boolean getValidee() {
        return validee;
    }

    public void setValidee(Boolean validee) {
        this.validee = validee;
    }

    public long getDatevalidation() {
        return datevalidation;
    }

    public void setDatevalidation(long datevalidation) {
        this.datevalidation = datevalidation;
    }

    public int getValsync() {
        return valsync;
    }

    public void setValsync(int valsync) {
        this.valsync = valsync;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public interventions( String title, long datedebut, long datefin, long heuredebutplan, long heurefinplan, String commentaires, long dateplanification, long heuredebuteffect, long heurefineffect, Boolean terminee, long dateterminaison, Boolean validee, long datevalidation, int valsync, int idSite) {

        this.title = title;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.heuredebutplan = heuredebutplan;
        this.heurefinplan = heurefinplan;
        this.commentaires = commentaires;
        this.dateplanification = dateplanification;
        this.heuredebuteffect = heuredebuteffect;
        this.heurefineffect = heurefineffect;
        this.terminee = terminee;
        this.dateterminaison = dateterminaison;
        this.validee = validee;
        this.datevalidation = datevalidation;
        this.valsync = valsync;
        this.idSite = idSite;
    }
}

package com.example.interventionapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.interventionapp.model.Employee;
import com.example.interventionapp.model.Intervention;
import com.example.interventionapp.model.clients;
import com.example.interventionapp.model.interventions;
import com.example.interventionapp.model.sites;

import java.util.Date;
import java.util.List;

@Dao
public interface IntervationDAO {
    //employee
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Employee emp);
   @Query("DELETE FROM employes")
  void deleteAllEmployee();
   @Query("SELECT * FROM employes WHERE login LIKE :login1 AND pwd LIKE:pwd1")
  LiveData<Employee> getUser(String login1 , String pwd1);
    //interventions
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(interventions i);
    @Query("DELETE FROM interventions")
    void deleteAllInterv();

    // Sites
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   void insert(sites site);
    @Query("DELETE FROM sites")
    void deleteAllSites();

    //clients
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   void insert(clients cl);
    @Query("DELETE FROM clients")
    void deleteAllClient();


    @Query("SELECT title as title,sites.adresse,nom,datedebut,datefin   from  interventions INNER JOIN sites ON sites.id=interventions.idSite INNER JOIN clients ON sites.idclient= clients.id" )
    LiveData<List<Intervention> >getInterventions();

}

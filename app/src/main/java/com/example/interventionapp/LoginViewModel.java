package com.example.interventionapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.interventionapp.model.Employee;

public class LoginViewModel extends AndroidViewModel {
    IntervationDAO intervationDAO;
    public LoginViewModel(@NonNull Application application) {
        super(application);

        IntervationDataRoom db = IntervationDataRoom.getDatabase(application);
        intervationDAO=db.intervationDAO();

    }

    LiveData<Employee> getuser(String Login, String Pwd) {

        return intervationDAO.getUser(Login, Pwd);
    }
    void Insert(Employee emp)
    {
        intervationDAO.insert(emp);
    }

}

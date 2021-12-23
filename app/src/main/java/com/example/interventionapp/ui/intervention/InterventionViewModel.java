package com.example.interventionapp.ui.intervention;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.interventionapp.IntervationDAO;
import com.example.interventionapp.IntervationDataRoom;
import com.example.interventionapp.model.Employee;
import com.example.interventionapp.model.Intervention;
import com.example.interventionapp.model.interventions;

import java.util.List;

public class InterventionViewModel extends AndroidViewModel {
    IntervationDAO intervationDAO;
    private static LiveData<List<Intervention>> mIntervention;
    public InterventionViewModel(@NonNull Application application) {
        super(application);

        IntervationDataRoom db = IntervationDataRoom.getDatabase(application);
        intervationDAO=db.intervationDAO();

    }

    LiveData<List<Intervention>> getInterventions() {

        return intervationDAO.getInterventions();
    }
}
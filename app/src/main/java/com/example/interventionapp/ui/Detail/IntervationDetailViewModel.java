package com.example.interventionapp.ui.Detail;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.interventionapp.IntervationDAO;
import com.example.interventionapp.IntervationDataRoom;
import com.example.interventionapp.model.Intervention;

import java.util.List;

public class IntervationDetailViewModel extends AndroidViewModel {

        IntervationDAO intervationDAO;
        private static LiveData<List<Intervention>> mInterventionD;
        public IntervationDetailViewModel(@NonNull Application application) {
            super(application);

            IntervationDataRoom db = IntervationDataRoom.getDatabase(application);
            intervationDAO=db.intervationDAO();

        }


}

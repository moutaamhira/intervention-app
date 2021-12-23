package com.example.interventionapp.ui.intervention;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.interventionapp.R;
import com.example.interventionapp.model.Intervention;
import com.example.interventionapp.model.SelectListener;
import com.example.interventionapp.model.intervation_adapter;
import com.example.interventionapp.ui.Detail.InterventionDetail;
import com.example.interventionapp.ui.home.HomeFragment;

import java.util.Calendar;
import java.util.List;

public class InterventionFragment extends Fragment{



    private InterventionViewModel interventionViewModel;

    RecyclerView recyclerView;
    List<Intervention> data;
    ImageView btndatehier,btndatedemain;
    TextView txtdate;







    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        txtdate.findViewById(R.id.txtdate);
        btndatehier.setOnClickListener(v ->{
            Calendar tomorrow = Calendar.getInstance();
            tomorrow.roll(Calendar.DATE, -1);
            txtdate.setText(tomorrow.toString());
        });
        btndatedemain.setOnClickListener(v ->{
            Calendar tomorrow = Calendar.getInstance();
            tomorrow.roll(Calendar.DATE, 1);
            txtdate.setText(tomorrow.toString());
        });

        View root = inflater.inflate(R.layout.fragment_intervetion, container, false);

        interventionViewModel = new ViewModelProvider(this).get(InterventionViewModel.class);

        recyclerView=root.findViewById(R.id.recycler);
        interventionViewModel.getInterventions().observe(getViewLifecycleOwner(), new Observer<List<Intervention>>() {
            @Override
            public void onChanged(List<Intervention> interventionList) {
                data = interventionList;

                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                intervation_adapter adapter = new intervation_adapter(data, new SelectListener() {
                    @Override
                    public void onItemClicked(Intervention intervention) {
                        Intent intent = new Intent(getActivity(), InterventionDetail.class);
                        intent.putExtra("intervention",intervention);
                        startActivity(intent);
                    }
                });
                recyclerView.setAdapter(adapter);
            }
        });



        return root;

}



}
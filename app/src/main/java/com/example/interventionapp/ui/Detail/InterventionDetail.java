package com.example.interventionapp.ui.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.interventionapp.Historique;
import com.example.interventionapp.LoginActivity2;
import com.example.interventionapp.MainActivity;
import com.example.interventionapp.MapsActivity;
import com.example.interventionapp.R;
import com.example.interventionapp.model.Intervention;

public class InterventionDetail extends AppCompatActivity {
   ImageView btn;
   Button btncarte;
    Button btnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intervention_detail);

        Intervention intervention= (Intervention) getIntent().getSerializableExtra("intervention");
        btn=findViewById(R.id.btnretern);
        btncarte=findViewById(R.id.btncarte);
       btnh=findViewById(R.id.btnh);
        btn.setOnClickListener(v -> {startActivity(new Intent(InterventionDetail.this, MainActivity.class));});
btncarte.setOnClickListener(v ->{startActivity(new Intent(InterventionDetail.this, MapsActivity.class));} );
        btnh.setOnClickListener(v ->{startActivity(new Intent(InterventionDetail.this, Historique.class));} );
    }

}

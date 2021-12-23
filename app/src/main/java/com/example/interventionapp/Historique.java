package com.example.interventionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.interventionapp.ui.Detail.InterventionDetail;

public class Historique extends AppCompatActivity {
ImageView btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historique);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {startActivity(new Intent(Historique.this, InterventionDetail.class));});
    }
}
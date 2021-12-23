package com.example.interventionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.example.interventionapp.model.Employee;
import com.google.android.material.textfield.TextInputLayout;
import  androidx.lifecycle.ViewModelProvider ;

public class LoginActivity2 extends AppCompatActivity {
    TextInputLayout login;
    TextInputLayout pwd;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.textInputLayout2);
        pwd=findViewById(R.id.textInputLayout);
        btn=findViewById(R.id.login);
        LoginViewModel loginViewModel=new ViewModelProvider(this).get(LoginViewModel.class);

        btn.setOnClickListener(v -> {

            LiveData<Employee> liveData=loginViewModel.getuser(login.getEditText().getText().toString(),pwd.getEditText().getText().toString());
            liveData.observe(LoginActivity2.this,employee->{if (employee==null)
            {
                //Log.e("emmmmmmmmmmmmmmmmmm",employee.getLogin());
                Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                login.setError("login erronee");
                pwd.setError("password errone");

            }
            else
            {
                startActivity(new Intent(LoginActivity2.this,MainActivity.class));
            }});

        });

    }
}
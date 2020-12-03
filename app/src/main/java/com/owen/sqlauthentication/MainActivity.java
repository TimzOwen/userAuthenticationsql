package com.owen.sqlauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnReg;
    EditText email,password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // call the ids functions
        Ids();

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //collect the user inputs
                String emailUser,userPassword,userConfirm;
                emailUser = email.getText().toString().trim();
                userPassword = password.getText().toString().trim();
                userConfirm = confirmPassword.getText().toString().trim();
            }
        });

    }
    public void Ids(){
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        confirmPassword = findViewById(R.id.etConfirmPassword);
    }
}
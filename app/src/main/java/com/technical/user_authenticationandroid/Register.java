package com.technical.user_authenticationandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText postalAddress;
    EditText emailAddress = findViewById(R.id.email);
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstName = findViewById(R.id.firstName1);
        lastName = findViewById(R.id.lastName1);
        postalAddress = findViewById(R.id.postalAddress1);
        register = findViewById(R.id.register1);//
    }
}
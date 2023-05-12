package com.technical.user_authenticationandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText postalAddress;
    EditText emailAddress = findViewById(R.id.email);
    Button register;

//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstName = findViewById(R.id.firstName1);
        lastName = findViewById(R.id.lastName1);
        postalAddress = findViewById(R.id.postalAddress1);
        register = findViewById(R.id.register1);
        emailAddress = findViewById(R.id.email);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });


    }

     boolean isEmpty(EditText text)
     {
       CharSequence str = text.getText().toString();
       return TextUtils.isEmpty(str);

     }
     boolean isEmail(EditText text)
     {
         CharSequence email = text.getText().toString();
         return (!TextUtils.isEmpty(email)&& Patterns.EMAIL_ADDRESS.matcher(email).matches());
     }



    void checkDataEntered()
    {
        if(isEmpty(firstName))
        {
            Toast message = Toast.makeText(this,"You must enter first name to register!",Toast.LENGTH_SHORT);
            message.show();
        }
        if(isEmpty(lastName))
        {
            lastName.setError("Last name is required!");
        }
    }


}
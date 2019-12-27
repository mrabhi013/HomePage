package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {


EditText email;
EditText password;
Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        email = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        btnlogin = (Button)findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(email.getText().toString().equals("admin") && password.getText().toString().equals("1234")){

                    Toast.makeText(getApplicationContext(),"Redirecting..",Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(getApplicationContext(),"Wrong Credentials!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

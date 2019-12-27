package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAdmin,btnSTUD,btnABOUT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdmin = (Button) findViewById(R.id.btnADMIN);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AdminLogin.class);
                startActivity(i);

            }
        });
       btnSTUD = (Button)findViewById(R.id.btnSTUD);
       btnSTUD.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent in=new Intent(getApplicationContext(),StudentLogin.class);
               startActivity(in);
           }
       });

        btnABOUT = (Button)findViewById(R.id.btnABOUT);
        btnABOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),About.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allbodyparts extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allbodyparts);

        b1=findViewById(R.id.btnelbow);
        b2=findViewById(R.id.btnfinger);
        b3=findViewById(R.id.btnforearm);
        b4=findViewById(R.id.btnhand);
        b5=findViewById(R.id.btnhumerus);
        b6=findViewById(R.id.btnshoulder);
        b7=findViewById(R.id.btnwrist);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(allbodyparts.this,elbow.class);
                startActivity(intent);
            }
        });



    }
}
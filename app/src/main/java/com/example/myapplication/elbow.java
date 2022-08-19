package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class elbow extends AppCompatActivity {

    int[] newArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        newArray= new int[]{
                R.id.ex1,R.id.ex2,R.id.ex3,R.id.ex4,R.id.ex5
        };
    }


    public void ImagebuttonClicked(View view){

        for(int i=0;i< newArray.length;i++){
            if(view.getId()== newArray[i]){
               int value=i+1;
               // Log.i("FIRST",String.copyValueOf(value));
                Log.i("FIRST",String.copyValueOf(value));
                Intent intent=new Intent(elbow.this,elboweach.class);
                startActivity(intent);

            }
        }

    }
}
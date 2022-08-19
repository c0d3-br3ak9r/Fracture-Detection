package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;

import android.provider.MediaStore;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int RESULT_LOAD_IMAGE=1;
    ImageView imageToUpload;
    Button bUploadImage;

    Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageToUpload=(ImageView) findViewById(R.id.imageToUpload);

        bUploadImage=(Button) findViewById(R.id.bUploadImaage);

        imageToUpload.setOnClickListener(this);
        bUploadImage.setOnClickListener(this);

        move=findViewById(R.id.btnFindMe);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,allbodyparts.class);
                startActivity(intent);
            }
        });

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.imageToUpload:
                Intent galleryIntent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent,RESULT_LOAD_IMAGE);

                break;
            case R.id.bUploadImaage:

                break;

        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode==RESULT_LOAD_IMAGE && resultCode==RESULT_OK&& data!=null){
            Uri selectedImage=data.getData();
            imageToUpload.setImageURI(selectedImage);
        }
    }
}





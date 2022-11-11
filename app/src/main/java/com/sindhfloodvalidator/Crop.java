package com.sindhfloodvalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Crop extends AppCompatActivity {

    EditText etcnic;
    ImageView searchdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);

        getSupportActionBar().setTitle("Validate Crop");

        etcnic = findViewById(R.id.etsearchcnic);
        searchdata = findViewById(R.id.searchdata);


    }

}
package com.sindhfloodvalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btncrop, btnhouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncrop = findViewById(R.id.cropbtn);
        btnhouse = findViewById(R.id.housebtn);

    }

    public void movetocrop(View view) {
        Intent intent = new Intent(MainActivity.this, Crop.class);
        startActivity(intent);
    }

    public void movetohouse(View view) {
        Intent intent = new Intent(MainActivity.this, House.class);
        startActivity(intent);
    }
}
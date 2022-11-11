package com.sindhfloodvalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


//        hide action and status bar code start
        getSupportActionBar().hide();
//        x and y coordinates values
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        hide action and status bar code end

//        full screen layout start
        View overlay=  findViewById(R.id.splashlayout);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//        full screen layout code end

        Intent login=new Intent(SplashActivity.this, LoginActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(login);
                finish();
            }
        }, 4000);



    }
}
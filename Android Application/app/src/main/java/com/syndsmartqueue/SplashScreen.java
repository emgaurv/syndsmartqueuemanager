package com.syndsmartqueue;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // To hide Title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //open new activity on 3sec delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences prefs = getSharedPreferences("ACCOUNTNO", MODE_PRIVATE);
                String account = prefs.getString("accountnoretrive", "na");
                if(account == "na"){
                    Intent i = new Intent(SplashScreen.this, login.class);
                    startActivity(i);
                }else{
                    Intent i = new Intent(SplashScreen.this, Dashboard.class);
                    startActivity(i);
                }
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}

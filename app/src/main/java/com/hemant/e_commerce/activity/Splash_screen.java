package com.hemant.e_commerce.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hemant.e_commerce.R;

public class Splash_screen extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


    new Handler().postDelayed(new Runnable(){
        @Override
        public void run() {
            /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(Splash_screen.this,Welcome.class);
       startActivity(mainIntent);
          finish();
        }
    }, SPLASH_DISPLAY_LENGTH);
}
}

package com.sunil.test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.sunil.test.R;
import com.sunil.test.activity.ui.HomeActivity;

public class SplashActivity extends AppCompatActivity {
    // Splash screen timer
    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startTimer();
    }

    /*
     * Showing splash screen with a timer. This will be useful when you
     * want to show case your app logo / company
     */
    private void startTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

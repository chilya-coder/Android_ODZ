package it_school.sumdu.edu.booklibrarysqlite;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import it_school.sumdu.edu.booklibrarysqlite.MainActivity;
import it_school.sumdu.edu.booklibrarysqlite.R;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    private ProgressBar progressBar;

    @SuppressLint("CustomSplashScreen")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        progressBar = findViewById(R.id.progressBar);
        Timer timer = new Timer();
        timer.schedule(new SplashTask(), 0, 30);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(Splash.this, MainActivity.class);
            startActivity(i);
            finish();
        }, 3000);
    }

    class SplashTask extends TimerTask {
        int i = 0;

        @Override
        public void run() {
            if (i < 100) {
                i++;
                progressBar.setProgress(i);
            } else {
                this.cancel();
            }
        }
    }
}
package com.example.siddh.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {

            public void onTick(long msecUntilDone) {

                //Countdown counting down (every second)
                Log.i(" Seconds left", String.valueOf(msecUntilDone / 1000));

            }

            public void onFinish() {

                //Countdown is finished (after 10 seconds)
                Log.i("Done", "CountDown timer finished");

            }

        }.start();

    }
}

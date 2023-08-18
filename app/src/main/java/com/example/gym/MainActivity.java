package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            new Handler().postDelayed(new Runnable() {




                @Override
                public void run()

                {
                    LocalTime now = LocalTime.now();
                    int hour = now.getHour();


                    if(hour>= 9 && hour<=12 ) {
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    } else {
                        startActivity(new Intent(MainActivity.this,MainActivity3.class));
                            finish();}
                }
            },3000);
        }

    }
}
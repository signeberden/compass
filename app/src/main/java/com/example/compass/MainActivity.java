package com.example.compass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when compass button is pressed*/
    public void pressedCompass(View view){
        Intent it = new Intent(this, CompassDisplay.class);
        startActivity(it);
    }
    /**Called when accelerometer button is pressed*/
    public void pressedAccelerometer(View view){
        Intent intent = new Intent(this, AccelerometerDisplay.class);
        startActivity(intent);
    }
}
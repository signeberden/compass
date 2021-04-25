package com.example.compass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.TextView;

public class AccelerometerDisplay extends AppCompatActivity implements SensorEventListener {

    private TextView xText;
    private TextView yText;
    private TextView zText;
    private TextView maxX;
    private TextView maxY;
    private TextView maxZ;
    private TextView direction;
    private Sensor mySensor;
    private SensorManager SM;

    private float deltaXMax = 0;
    private float deltaYMax = 0;
    private float deltaZMax = 0;

    private float deltaX = 0;
    private float deltaY = 0;
    private float deltaZ = 0;

    private float lastX, lastY, lastZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_display);

        //Creating Sensor Manager
        SM= (SensorManager)getSystemService(SENSOR_SERVICE);

        //Accelerometer sensor
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //Register sensor listener
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        //Assign text view
        xText = (TextView)findViewById(R.id.currentX);
        yText = (TextView)findViewById(R.id.currentY);
        zText = (TextView)findViewById(R.id.currentZ);
        maxX = (TextView) findViewById(R.id.maxX);
        maxY = (TextView) findViewById(R.id.maxY);
        maxZ = (TextView) findViewById(R.id.maxZ);
        direction = (TextView) findViewById(R.id.textView3);



    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        xText.setText("" + event.values[0]);
        yText.setText("" + event.values[1]);
        zText.setText("" + event.values[2]);

        deltaX = Math.abs(lastX - event.values[0]);
        deltaY = Math.abs(lastY - event.values[1]);
        deltaZ = Math.abs(lastZ - event.values[2]);
        displayMaxValues();
        float x = event.values[0];

        if(x<-1){
            direction.setText("Right");
        } else if (x>1){
            direction.setText("Left");
        } else{
            direction.setText("");
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //Not in use
    }
    // display the max x,y,z accelerometer values
    public void displayMaxValues() {
        if (deltaX > deltaXMax) {
            deltaXMax = deltaX;
            maxX.setText(Float.toString(deltaXMax));
        }
        if (deltaY > deltaYMax) {
            deltaYMax = deltaY;
            maxY.setText(Float.toString(deltaYMax));
        }
        if (deltaZ > deltaZMax) {
            deltaZMax = deltaZ;
            maxZ.setText(Float.toString(deltaZMax));
        }
    }
}
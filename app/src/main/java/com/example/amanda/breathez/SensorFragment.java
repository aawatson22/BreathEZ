package com.example.amanda.breathez;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.LinkedList;

import static com.example.amanda.breathez.Evaluate.evalClassifier;

public class SensorFragment extends Fragment implements SensorEventListener {

    private static final float SHAKE_THRESHOLD = 1.1f;
    private static final int SHAKE_WAIT_TIME_MS = 250;
    private static final float ROTATION_THRESHOLD = 2.0f;
    private static final int ROTATION_WAIT_TIME_MS = 100;

    private View mView;
    private TextView mTextTitle;
    private TextView mTextValues;
    private SensorManager mSensorManager;
    private Sensor mSensor;
    private int mSensorType;
    private long mShakeTime = 0;
    private long mRotationTime = 0;
    private float lastTime = 0;
    private float totalTime = 0;

    LinkedList<Float> accelZData = new LinkedList<Float>();
    LinkedList<Long> timeList = new LinkedList<Long>();
    int listStartIndex = 0;

    private int ATCount = 0;
    private Vibrator mVibrator;

    private float maxAccelAverage;
    private float prevATMax = 0;



    public static SensorFragment newInstance(int sensorType) {
        SensorFragment f = new SensorFragment();

        // Supply sensorType as an argument
        Bundle args = new Bundle();
        args.putInt("sensorType", sensorType);
        f.setArguments(args);

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        if(args != null) {
            mSensorType = args.getInt("sensorType");
        }

        mSensorManager = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);
        mSensor = mSensorManager.getDefaultSensor(mSensorType);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.sensor, container, false);

        mTextTitle = (TextView) mView.findViewById(R.id.text_title);
        //mTextTitle.setText(mSensor.getStringType());
        mTextValues = (TextView) mView.findViewById(R.id.text_values);


        return mView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // If sensor is unreliable, then just return
        if (event.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE)
        {
            return;
        }

       // mTextValues.setText(
         //       "x = " + Float.toString(event.values[0]) + "\n" +
           //     "y = " + Float.toString(event.values[1]) + "\n" +
             //   "z = " + Float.toString(event.values[2]) + "\n"
       // );

        long time = System.currentTimeMillis();
        if(totalTime < 1500){
            accelZData.add(event.values[2]);
            timeList.add(time);

            long time1 = timeList.getFirst();
            long time2 = timeList.getLast();


            totalTime = time2 - time1;
            //Log.i("lasttime : ","" + time2);
            //Log.i("firsttime : ","" + time1);
            //Log.i("totalTime : ","" + totalTime);



        }
        else{
            try {
                detectAbThrust(accelZData, timeList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            while(totalTime > 750) {

                accelZData.pop();
                timeList.pop();

                long time1 = timeList.getFirst();
                long time2 = timeList.getLast();
                totalTime = time2 - time1;
            }
            accelZData.add(event.values[2]);
            timeList.add(time);

        }

        //Log.i("time : ", "" + time);
        //Log.i("accelZData : ", "" + event.values[2]);
        //Log.i("lastTime : ", "" + lastTime);

        /*if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            detectShake(event);
        }
        else if(event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
            detectRotation(event);
        }*/
        lastTime = event.values[2];
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }




    private void detectRotation(SensorEvent event) {
        long now = System.currentTimeMillis();

        if((now - mRotationTime) > ROTATION_WAIT_TIME_MS) {
            mRotationTime = now;

            // Change background color if rate of rotation around any
            // axis and in any direction exceeds threshold;
            // otherwise, reset the color
            if(Math.abs(event.values[0]) > ROTATION_THRESHOLD ||
                    Math.abs(event.values[1]) > ROTATION_THRESHOLD ||
                    Math.abs(event.values[2]) > ROTATION_THRESHOLD) {
                mView.setBackgroundColor(Color.rgb(0, 0, 100));
            }
            else {
                mView.setBackgroundColor(Color.BLACK);
            }
        }
    }

    private void detectShake(SensorEvent event) {
        long now = System.currentTimeMillis();

        if((now - mShakeTime) > SHAKE_WAIT_TIME_MS) {
            mShakeTime = now;

            float gX = event.values[0] / SensorManager.GRAVITY_EARTH;
            float gY = event.values[1] / SensorManager.GRAVITY_EARTH;
            float gZ = event.values[2] / SensorManager.GRAVITY_EARTH;

            // gForce will be close to 1 when there is no movement
            float gForce = (float)Math.sqrt(gX*gX + gY*gY + gZ*gZ);
            Log.i("gforce : ", "" + gForce);

            // Change background color if gForce exceeds threshold;
            // otherwise, reset the color
            if(gForce > SHAKE_THRESHOLD) {
                mView.setBackgroundColor(Color.rgb(0, 100, 0));
            }
            else {
                mView.setBackgroundColor(Color.BLACK);
            }
        }
    }

    private void detectAbThrust(LinkedList<Float> accelList, LinkedList<Long> timeList) throws Exception {

        //Calculate 5 metrics
        //maxAcceleration
        float max = Collections.max(accelList);
        int maxLoc = accelList.indexOf(max);

        //if max is not at the beginning or end of the window
        if(maxLoc == 0 || maxLoc == accelList.size()){
            //DNE
        }
        else {

            //minLeft
            float minLeft = Collections.min(accelList.subList(0, maxLoc));
            int minLeftLoc = accelList.indexOf(minLeft);

            //minRight
            float minRight = Collections.min(accelList.subList(maxLoc, accelList.size()));
            int minRightLoc = accelList.indexOf(minRight);

            //slopeIn
            float slopeIn = (max-minLeft)/(timeList.get(maxLoc)-timeList.get(minLeftLoc));

            //slopeOut
            float slopeOut = (max-minRight)/(timeList.get(minRightLoc)-timeList.get(maxLoc));

            //Convert to string to send to classifier
            String stringMax = String.valueOf(max);
            String stringMinLeft = String.valueOf(minLeft);
            String stringMinRight = String.valueOf(minRight);
            String stringSlopeLeft = String.valueOf(slopeIn);
            String stringSlopeRight = String.valueOf(slopeOut);

            //Send data to weka classifier

            String[] dataArray = {stringMax, stringMinLeft, stringMinRight, stringSlopeLeft, stringSlopeRight};

            RandomForest rf = new WekaclassifierRandomForest();

            //Get AT or NAT prediction back from weka
            String prediction = evalClassifier(rf, dataArray);

            Log.i("prediction : ", "" + prediction);

            //mVibrator = mVibrator = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);


            //Count AT's
            if (prediction.equals("AT")) {
                //Do not count same AT's in 2 consecutive windows
                if(prevATMax!=max) {
                    ATCount = ATCount + 1;
                    mView.setBackgroundColor(Color.rgb(0, 100, 0));
                    mTextValues.setText(Integer.toString(ATCount));
                    // mVibrator.vibrate(500);
                    maxAccelAverage = maxAccelAverage + max;
                    prevATMax=max;
                }
            } else {
                mView.setBackgroundColor(Color.BLACK);
            }
            Log.i("ATCount : ", "" + ATCount);

            //Once we make it to 5 AT's give feedback
            if(ATCount >= 5){
                maxAccelAverage=maxAccelAverage/ATCount;

                if(maxAccelAverage>30){
                    mTextValues.setText("Too Hard");
                    mView.setBackgroundColor(Color.rgb(100, 100, 0));
                }
                else if(maxAccelAverage<5){
                    mTextValues.setText("Too Soft");
                    mView.setBackgroundColor(Color.rgb(100, 100, 0));
                }
                else{
                    mTextValues.setText("Just Right");
                    mView.setBackgroundColor(Color.rgb(0, 100, 0));
                }


                ATCount = 0;
            }


        }
    }


}

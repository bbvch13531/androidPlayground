package com.example.kyungyoungheo.toucheventexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.d("TouchEventExample","====================");
        Log.d("TouchEventExample","dispatchTouchEvent()");
        Log.d("TouchEventExample","Action Code : " + ev.getAction());
        Log.d("TouchEventExample","XY Position : " + ev.getX() + "," + ev.getY());
        Log.d("TouchEventExample","Event Time : " + ev.getEventTime());
        Log.d("TouchEventExample","Down Event Time : " + ev.getDownTime());

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.d("TouchEventExample","====================");
        Log.d("TouchEventExample","onTouchEvent()");
        Log.d("TouchEventExample","Action Code : " + event.getAction());
        Log.d("TouchEventExample","XY Position : " + event.getX() + "," + event.getY());
        Log.d("TouchEventExample","Event Time : " + event.getEventTime());
        Log.d("TouchEventExample","Down Event Time : " + event.getDownTime());
        return super.onTouchEvent(event);
    }
}

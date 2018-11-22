package com.example.kyungyoungheo.toucheventexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create customViewGroup with code
        CustomViewGroup customViewGroup = new CustomViewGroup(this);
        customViewGroup.setBackgroundColor(Color.BLUE);
        FrameLayout.LayoutParams customViewGroupLp = new FrameLayout.LayoutParams(300,300);

        // Create customView with code
        CustomView customView = new CustomView(this);
        customView.setBackgroundColor(Color.YELLOW);
        FrameLayout.LayoutParams customViewLp = new FrameLayout.LayoutParams(150,150);

        customViewGroup.addView(customView,customViewLp);

        setContentView(customViewGroup,customViewGroupLp);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i("TouchEventExample","====================");
        Log.i("TouchEventExample","dispatchTouchEvent()");
        Log.i("TouchEventExample","Action Code : " + ev.getAction());
        Log.i("TouchEventExample","XY Position : " + ev.getX() + "," + ev.getY());
        Log.i("TouchEventExample","Event Time : " + ev.getEventTime());
        Log.i("TouchEventExample","Down Event Time : " + ev.getDownTime());

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.i("TouchEventExample","====================");
        Log.i("TouchEventExample","onTouchEvent()");
        Log.i("TouchEventExample","Action Code : " + event.getAction());
        Log.i("TouchEventExample","XY Position : " + event.getX() + "," + event.getY());
        Log.i("TouchEventExample","Event Time : " + event.getEventTime());
        Log.i("TouchEventExample","Down Event Time : " + event.getDownTime());
        return super.onTouchEvent(event);
    }
}

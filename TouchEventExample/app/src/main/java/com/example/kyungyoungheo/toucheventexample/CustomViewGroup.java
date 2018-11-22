package com.example.kyungyoungheo.toucheventexample;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class CustomViewGroup extends FrameLayout {
    public CustomViewGroup(Context context){
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("TouchEventExample","CustomViewGroup dispatchTouchEvent() >> " + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TouchEventExample","CustomViewGroup onTouchEvent() >> " + event.getAction());
        return super.onTouchEvent(event);
    }
}

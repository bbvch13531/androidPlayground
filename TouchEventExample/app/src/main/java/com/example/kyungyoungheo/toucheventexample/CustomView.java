package com.example.kyungyoungheo.toucheventexample;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {

    public CustomView(Context context){
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("TouchEventExample","CustomView dispatchTouchEvent() >> " + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TouchEventExample","CustomView onTouchEvent() >> " + event.getAction());
        return super.onTouchEvent(event);
    }
}

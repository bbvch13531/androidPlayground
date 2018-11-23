package com.example.kyungyoungheo.toucheventexample.TouchEvent;

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
        Log.i("TouchEventExample","CustomView dispatchTouchEvent() >> " + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("TouchEventExample","CustomView onTouchEvent() >> " + event.getAction());

//        return super.onTouchEvent(event);
        // return true to add onInterceptTouchEvent
        return true;
    }
}

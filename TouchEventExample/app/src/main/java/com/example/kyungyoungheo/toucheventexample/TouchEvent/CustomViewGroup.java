package com.example.kyungyoungheo.toucheventexample.TouchEvent;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class CustomViewGroup extends FrameLayout {
    private float initialY = 0;

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

        // return true to add onInterceptTouchEvent
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.i("TouchEventExample", "CustomViewGroup onInterceptTouchEvent() >> " + event.getAction());

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                // Save coordinate Y when TouchDown occur
                initialY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                // 차이가 20이상 나면 이벤트를 가로챈다.
                if(Math.abs(initialY - event.getY()) >= 20 ){
                    Log.i("TouchEventExample","Event Occured");
                    return true;
                }
        }
        return super.onInterceptTouchEvent(event);
    }
}

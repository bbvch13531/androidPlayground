package com.example.kyungyoungheo.toucheventexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;

public class TouchListener extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touchlistener);

        Button listenerButton = (Button) findViewById(R.id.listenerButton);

//        listenerButton.setOnTouchListener(new MyTouchListener());
        listenerButton.setOnClickListener(new MyClickListener());
        listenerButton.setOnLongClickListener(new MyLongClickListener());
    }

    private class MyTouchListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            Log.i("TouchListener","Button View onTouch() >> " + event.getAction());
            return false;
        }
    }

    private class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Log.i("TouchListener","Button View onClick()");
        }
    }

    private class MyLongClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            Log.i("TouchListener","Button View onLongLongClick()");
            return false;
        }

    }
}

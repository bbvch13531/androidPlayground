package com.example.kyungyoungheo.toucheventexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class TouchListener extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touchlistener);

        Button listenerButton = (Button) findViewById(R.id.listenerButton);

        listenerButton.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("TouchListener","Button View onTouch() >> " + event.getAction());
                return false;
            }
        });
    }
}

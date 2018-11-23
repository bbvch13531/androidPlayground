package com.example.kyungyoungheo.toucheventexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.kyungyoungheo.toucheventexample.TouchEvent.TouchEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onTouchEvent(View view){
        Intent intent = new Intent(this,TouchEvent.class);
        startActivity(intent);
    }

    public void onTouchListener(View view){
        Intent intent = new Intent(this,TouchListener.class);
        startActivity(intent);
    }
}

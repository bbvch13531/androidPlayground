package com.example.kyungyoungheo.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        TextView receivedStr = (TextView) findViewById(R.id.intent_recieved_data);
        receivedStr.setText(""+name);
    }
}

package com.example.kyungyoungheo.intentexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kyungyoungheo.anotherapp.CustomData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomData customData = new CustomData();
        Intent intent = getIntent();
        try {
            customData = (CustomData) intent.getSerializableExtra("CUSTOM_DATA");
        } catch (Exception e){
            Log.d("customdata","exception");
        }
        if(customData==null){
            Toast.makeText(this,"Cannot read CustomData",Toast.LENGTH_LONG).show();
            return ;
        }

        TextView receivedStr = (TextView) findViewById(R.id.intent_recieved_data);
        receivedStr.setText("CustomData : "+customData.getmStringName() + " "+customData.getmIntAge());
    }
}

package com.example.kyungyoungheo.intentexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kyungyoungheo.anotherapp.SerialData;
import com.example.kyungyoungheo.anotherapp.ParcelData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SerialData serialData = new SerialData();
        ParcelData parcelData = new ParcelData();
        Intent intent = getIntent();
        try {
            parcelData = (ParcelData) intent.getParcelableExtra("PARCEL_DATA");
//            serialData = (SerialData) intent.getSerializableExtra("SERIAL_DATA");

        } catch (Exception e){
            Log.d("serialData","exception");
        }
//
//        if(serialData==null){
//            Toast.makeText(this,"Cannot read serialData",Toast.LENGTH_LONG).show();
//        }
//        else {
//            TextView receivedStr = (TextView) findViewById(R.id.intent_recieved_data);
//            receivedStr.setText("SerialData : "+serialData.getmStringName() + " "+serialData.getmIntAge());
//        }
        if(parcelData==null){
            Toast.makeText(this,"Cannot read parcelData",Toast.LENGTH_LONG).show();
        }
        else{
            TextView receivedStr = (TextView) findViewById(R.id.intent_recieved_data);
            receivedStr.setText("ParcelData : "+parcelData.getmStringName() + " "+parcelData.getmIntAge());
        }
    }
}

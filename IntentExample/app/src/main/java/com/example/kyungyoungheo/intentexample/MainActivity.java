package com.example.kyungyoungheo.intentexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kyungyoungheo.anotherapp.SerialData;
import com.example.kyungyoungheo.anotherapp.ParcelData;

import java.io.NotSerializableException;

import androidx.versionedparcelable.VersionedParcel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SerialData serialData ;
        ParcelData parcelData ;
        Intent intent = getIntent();

        parcelData = (ParcelData) intent.getParcelableExtra("PARCEL_DATA");
        serialData = (SerialData) intent.getSerializableExtra("SERIAL_DATA");

        TextView receivedStr = (TextView) findViewById(R.id.intent_recieved_data);

        if(parcelData!= null){
            receivedStr.setText("ParcelData : "+parcelData.getmStringName() + " "+parcelData.getmIntAge());
        }
        else if(serialData!=null){
            receivedStr.setText("SerialData : "+serialData.getmStringName() + " "+serialData.getmIntAge());
        }
        else{

        }





    }
}

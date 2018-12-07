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
        Bundle bundle;
        Intent intent = getIntent();

        int flag = intent.getIntExtra("FLAG",0);

        TextView receivedStr = (TextView) findViewById(R.id.intent_recieved_data);

        switch(flag){
            case 0:
                // ERROR
                break;
            case 1:
                //Serialization data
                serialData = (SerialData) intent.getSerializableExtra("SERIAL_DATA");
                receivedStr.setText("SerialData : "+serialData.getmStringName() + " "+serialData.getmIntAge());
                break;
            case 2:
                //Parcel data
                parcelData = (ParcelData) intent.getParcelableExtra("PARCEL_DATA");
                receivedStr.setText("ParcelData : "+parcelData.getmStringName() + " "+parcelData.getmIntAge());
                break;
            case 3:
                //Bundle data
                bundle = intent.getBundleExtra("BUNDLE_DATA");
                String name = bundle.getString("NAME");
                int age = bundle.getInt("AGE");
                receivedStr.setText("SerialData : "+name + " "+age);
                break;
        }
    }
}

package com.example.kyungyoungheo.anotherapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSerialClick(View v){
        Intent intent = new Intent();

        ComponentName componentName = new ComponentName(
                "com.example.kyungyoungheo.intentexample",
                "com.example.kyungyoungheo.intentexample.MainActivity");
        intent.setComponent(componentName);

        SerialData serialData = new SerialData();
//        int[] array = {10,20,30,40,50};
//        serialData.setmIntArray(array);
        serialData.setmIntAge(24);
        serialData.setmStringName("Hello serial");

        intent.putExtra("SERIAL_DATA", serialData);

        startActivity(intent);
    }
    public void onParcelClick(View v){
        Intent intent = new Intent();

        ComponentName componentName = new ComponentName(
                "com.example.kyungyoungheo.intentexample",
                "com.example.kyungyoungheo.intentexample.MainActivity");
        intent.setComponent(componentName);

        ParcelData parcelData = new ParcelData();
        parcelData.setmIntAge(25);
        parcelData.setmStringName("Hello parcel");

        intent.putExtra("PARCEL_DATA",parcelData);
        Log.d("test","sendparceldata");
        startActivity(intent);
    }
}

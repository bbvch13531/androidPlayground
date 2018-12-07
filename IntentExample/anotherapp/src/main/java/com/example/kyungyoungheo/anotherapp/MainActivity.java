package com.example.kyungyoungheo.anotherapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent();

        ComponentName componentName = new ComponentName(
                "com.example.kyungyoungheo.intentexample",
                "com.example.kyungyoungheo.intentexample.MainActivity");
        intent.setComponent(componentName);
    }

    public void onSerialClick(View v){

        SerialData serialData = new SerialData();
//        int[] array = {10,20,30,40,50};
//        serialData.setmIntArray(array);
        serialData.setmIntAge(24);
        serialData.setmStringName("Hello serial");
        intent.putExtra("FLAG",1);
        intent.putExtra("SERIAL_DATA", serialData);

        startActivity(intent);
    }
    public void onParcelClick(View v){

        ParcelData parcelData = new ParcelData();
        parcelData.setmIntAge(25);
        parcelData.setmStringName("Hello parcel");
        intent.putExtra("FLAG",2);
        intent.putExtra("PARCEL_DATA",parcelData);
        Log.d("test","sendparceldata");
        startActivity(intent);
    }

    public void onBundleClick(View v){
        Bundle bundleData = new Bundle();
        bundleData.putInt("AGE",224);
        bundleData.putString("NAME","LEEO");
        bundleData.putString("NAME","LEO");
        intent.putExtra("FLAG",3);
        intent.putExtra("BUNDLE_DATA",bundleData);
        startActivity(intent);
    }
}

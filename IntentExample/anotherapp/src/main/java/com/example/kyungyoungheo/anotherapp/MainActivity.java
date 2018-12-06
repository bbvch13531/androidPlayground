package com.example.kyungyoungheo.anotherapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View v){
        Intent intent = new Intent();

        ComponentName componentName = new ComponentName(
                "com.example.kyungyoungheo.intentexample",
                "com.example.kyungyoungheo.intentexample.MainActivity");
        intent.setComponent(componentName);

        CustomData customData = new CustomData();
//        int[] array = {10,20,30,40,50};
//        customData.setmIntArray(array);
        customData.setmIntAge(24);
        customData.setmStringName("Leo");

        intent.putExtra("CUSTOM_DATA",customData);

        startActivity(intent);
    }

}

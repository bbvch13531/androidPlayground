package com.example.anotherapp;

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

        startActivity(intent);
    }
}

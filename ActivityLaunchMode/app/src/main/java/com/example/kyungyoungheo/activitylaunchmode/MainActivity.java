package com.example.kyungyoungheo.activitylaunchmode;

import android.app.Activity;
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

    public void onFirstClick(View v){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
    protected void onStart(){
        Log.d("Lifecycle","Started");
        super.onStart();
    }
    protected void onResume(){
        Log.d("Lifecycle","Resumed");
        super.onResume();
    }
    protected void onPause(){
        Log.d("Lifecycle","Paused");
        super.onPause();
    }
    protected void onStop(){
        Log.d("Lifecycle","Stopped");
        super.onStop();
    }
    protected void onDestroy(){
        Log.d("Lifecycle","Destroyed");
        super.onDestroy();
    }
    protected void onRestart(){
        Log.d("Lifecycle","Restarted");
        super.onRestart();
    }
}

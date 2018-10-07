package com.example.kyungyoungheo.layoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMenuBtnClicked(View v){
        Intent menuIntent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(menuIntent);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(), "Button1 clicked!", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Toast.makeText(getApplicationContext(), "Button2 clicked!", Toast.LENGTH_LONG).show();
    }
}

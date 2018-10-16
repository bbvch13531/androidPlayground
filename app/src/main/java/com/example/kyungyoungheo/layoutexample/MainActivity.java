package com.example.kyungyoungheo.layoutexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
        Log.d("debugging","hello debug");
        startActivity(menuIntent);
    }

    public void onlinearLayoutBtnClicked(View v){
//        Toast.makeText(getApplicationContext(), "linearLayoutBtn clicked!", Toast.LENGTH_LONG).show();
        Intent linearLytIntent = new Intent(getApplicationContext(), LinearLytActivity.class);
        startActivity(linearLytIntent);
    }

    public void ontextViewBtnClicked(View v){
        Toast.makeText(getApplicationContext(), "textViewBtn clicked!", Toast.LENGTH_LONG).show();
    }

    public void onimageViewBtnClicked(View v){
        Toast.makeText(getApplicationContext(), "imageViewBtn clicked!", Toast.LENGTH_LONG).show();
    }

    public void ongridViewBtnClicked(View v){
        Toast.makeText(getApplicationContext(), "gridViewBtnClicked clicked!", Toast.LENGTH_LONG).show();
    }

    public void onTableViewBtnClicked(View v){
        Intent TableLytIntent = new Intent(getApplicationContext(), TableLytActivity.class);
        startActivity(TableLytIntent);
    }

    public void onScrollViewBtnClicked(View v){
        Intent ScrollLytIntent = new Intent(getApplicationContext(), ScrollActivity.class);
        startActivity(ScrollLytIntent);
    }

    public void onFrameViewBtnClicked(View v){
        Intent FrameLytIntent = new Intent(getApplicationContext(), FrameActivity.class);
        startActivity(FrameLytIntent);
    }
}

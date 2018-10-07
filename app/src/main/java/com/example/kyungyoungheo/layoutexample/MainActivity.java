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

    public void onlenearLayoutBtnClicked(View v){
        Toast.makeText(getApplicationContext(), "lenearLayoutBtn clicked!", Toast.LENGTH_LONG).show();
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

}

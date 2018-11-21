package com.example.kyungyoungheo.layoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void onReturnBtnClicked(View v){
        Toast.makeText(getApplicationContext(),"Return to main activity",Toast.LENGTH_LONG).show();

        finish();
    }
}

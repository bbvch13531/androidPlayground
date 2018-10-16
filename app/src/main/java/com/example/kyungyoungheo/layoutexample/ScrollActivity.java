package com.example.kyungyoungheo.layoutexample;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScrollActivity extends AppCompatActivity {
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        imageView = (ImageView) findViewById(R.id.imageView);

//        Resources res = getResources();
//        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
//        int bitmapWidth = bitmap.getIntrinsicWidth();
//        int bitmapHeight = bitmap.getIntrinsicHeight();
//
//        imageView.setImageDrawable(bitmap);
//        imageView.getLayoutParams().width = bitmapWidth;
//        imageView.getLayoutParams().height = bitmapHeight;

//        imageView.setImageResource (R.drawable.image01);
//        imageView.setImageDrawable (bitmap);
    }

    public void onScrollBtnClicked(View v){
        changeImage();
    }

    private void changeImage(){
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image02);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
}


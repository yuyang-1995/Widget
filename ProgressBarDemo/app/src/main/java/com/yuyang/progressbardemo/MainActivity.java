package com.yuyang.progressbardemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_pgbar;
    private AnimationDrawable ad;  //动画

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_pgbar = (ImageView) findViewById(R.id.pg);
        ad = (AnimationDrawable) img_pgbar.getDrawable();
        img_pgbar.postDelayed(new Runnable() {
            @Override
            public void run() {
                ad.start();
            }
        }, 100);
    }}

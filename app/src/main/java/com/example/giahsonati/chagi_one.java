package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class chagi_one extends AppCompatActivity {
ImageView imageView1,imageView2;
TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chagi_one);

        imageView1=findViewById(R.id.imageView4);
        imageView2=findViewById(R.id.imageView5);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView33);
        textView3=findViewById(R.id.textView34);
        textView4=findViewById(R.id.textView36);
        textView5=findViewById(R.id.textView37);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


    }
package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Boo extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boo);

    /*    imageView=findViewById(R.id.imageView2);
        textView1=findViewById(R.id.textView_boo);
        textView2=findViewById(R.id.textView26);
        textView3=findViewById(R.id.textView27);
        textView4=findViewById(R.id.textView28);
        textView5=findViewById(R.id.textView29);
        textView6=findViewById(R.id.textView30);
        textView7=findViewById(R.id.textView31);
        textView8=findViewById(R.id.textView32);
        textView10=findViewById(R.id.textView34);*/

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


    }

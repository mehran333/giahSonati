package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Damnosh extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_damnosh);

        imageView=findViewById(R.id.imageView);
        textView1=findViewById(R.id.textView_asli);
        textView2=findViewById(R.id.textView19);
        textView3=findViewById(R.id.textView20);
        textView4=findViewById(R.id.textView21);
        textView5=findViewById(R.id.textView22);
        textView6=findViewById(R.id.textView23);
        textView7=findViewById(R.id.textView24);
        textView8=findViewById(R.id.textView25);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


    }

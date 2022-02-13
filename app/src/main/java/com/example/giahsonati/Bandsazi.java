package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Bandsazi extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandsazi);

        imageView=findViewById(R.id.imageView12);
        textView1=findViewById(R.id.textView61);
        textView2=findViewById(R.id.textView62);
        textView3=findViewById(R.id.textView63);
        textView4=findViewById(R.id.textView64);
        textView5=findViewById(R.id.textView65);
        textView6=findViewById(R.id.textView66);
        textView7=findViewById(R.id.textView67);
        textView8=findViewById(R.id.textView68);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


    }

package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Jensi extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jensi);

        textView1=findViewById(R.id.textView38);
        textView1=findViewById(R.id.textView39);
        textView1=findViewById(R.id.textView41);
        textView1=findViewById(R.id.textView42);
        textView1=findViewById(R.id.textView44);
        textView1=findViewById(R.id.textView45);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


    }

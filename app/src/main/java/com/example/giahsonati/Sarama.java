package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Sarama extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sarama);
        imageView=findViewById(R.id.imageView13);
        textView1=findViewById(R.id.textView69);
        textView2=findViewById(R.id.textView70);
        textView1=findViewById(R.id.textView71);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


    }


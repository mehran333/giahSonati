package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Dandan extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dandan);
        imageView=findViewById(R.id.imageView15);
        textView1=findViewById(R.id.textView76);
        textView2=findViewById(R.id.textView77);
        textView3=findViewById(R.id.textView78);
        textView4=findViewById(R.id.textView79);
        textView5=findViewById(R.id.textView80);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }


}


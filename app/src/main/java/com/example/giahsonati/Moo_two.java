package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Moo_two extends AppCompatActivity {
ImageView imageView;
TextView textView1,textView2,textView3,textView4,textView5,textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moo_two);

        imageView=findViewById(R.id.imageView_two);
        textView1=findViewById(R.id.textView9);
        textView2=findViewById(R.id.textView10);
        textView3=findViewById(R.id.textView11);
        textView4=findViewById(R.id.textView12);
        textView5=findViewById(R.id.textView13);
        textView6=findViewById(R.id.textView14);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    }

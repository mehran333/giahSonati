package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Imeni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imeni);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        ImageView imageView=findViewById(R.id.imeni_image);
        TextView textView=findViewById(R.id.txt_image);
        ImageView imageView1=findViewById(R.id.imeni_image2);
        TextView textView1=findViewById(R.id.txt_image);
        ImageView imageView2=findViewById(R.id.imeni_image2);
        TextView textView2=findViewById(R.id.txt_image3);
        ImageView imageView3=findViewById(R.id.imeni_image3);
        ImageView imageView4=findViewById(R.id.imeni_image4);
        TextView textView3=findViewById(R.id.txt_image4);
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


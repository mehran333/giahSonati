package com.example.giahsonati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button_sestem);
        Button button12 = findViewById(R.id.button_hasasiat);
        Button button2 = findViewById(R.id.button_mo);
        Button button3 = findViewById(R.id.button_hejamat);
        Button button4 = findViewById(R.id.button_tagzie);
        Button button5 = findViewById(R.id.button_badan);
        Button button6 = findViewById(R.id.button_damnosh);
        Button button7 = findViewById(R.id.button_boo);
        Button button8 = findViewById(R.id.button_zibai);
        Button button9 = findViewById(R.id.button_chagi);
        Button button10 = findViewById(R.id.button_jensi);
        Button button11 = findViewById(R.id.button_osotikhan);
        Button button13 = findViewById(R.id.button_srama);
        Button button15 = findViewById(R.id.button_dandan);
        Button button16 = findViewById(R.id.button_ofonat);
        Button button17 = findViewById(R.id.button_Post);
        Button button18 = findViewById(R.id.button_kamar);
        Button button19 = findViewById(R.id.button_garma);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button13.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.res, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_sestem:
                startActivity(new Intent(MainActivity.this, Imeni.class));
            case R.id.button_hasasiat:
                startActivity(new Intent(MainActivity.this, Hasasiat.class));
            case R.id.button_hejamat:
                startActivity(new Intent(MainActivity.this, Hejamat.class));
            case R.id.button_badan:
                startActivity(new Intent(MainActivity.this, Tagzie.class));
            case R.id.button_damnosh:
                startActivity(new Intent(MainActivity.this, Damnosh.class));
            case R.id.button_boo:
                startActivity(new Intent(MainActivity.this, Boo.class));
            case R.id.button_zibai:
                startActivity(new Intent(MainActivity.this, Zibai.class));
            case R.id.button_chagi:
                startActivity(new Intent(MainActivity.this, Chagi.class));
            case R.id.button_jensi:
                startActivity(new Intent(MainActivity.this,Jensi.class));
            case R.id.button_osotikhan:
                startActivity(new Intent(MainActivity.this, Ostokhan.class));
            case R.id.button_srama:
                startActivity(new Intent(MainActivity.this, Sarama.class));
            case R.id.button_dandan:
                startActivity(new Intent(MainActivity.this, Dandan.class));
            case R.id.button_ofonat:
                startActivity(new Intent(MainActivity.this, Ofonat.class));
            case R.id.button_Post:
                startActivity(new Intent(MainActivity.this, Post.class));
            case R.id.button_kamar:
                startActivity(new Intent(MainActivity.this, KamarDard.class));
            case R.id.button_garma:
                startActivity(new Intent(MainActivity.this, GarmaZadegi.class));


            }

        }

    }


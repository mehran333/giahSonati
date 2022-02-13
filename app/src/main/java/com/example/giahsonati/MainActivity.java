package com.example.giahsonati;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.giahsonati.Webservice.ApiService;
import com.example.giahsonati.aoi.People;
import com.example.giahsonati.aoi.RetrofitApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button11, button12, button9, button10, button13, button15, button16,
            button17, button18, button19;
    private RecyclerView recyclerView;
    private ApiService apiService;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_sestem);
        button12 = findViewById(R.id.button_hasasiat);
        button2 = findViewById(R.id.button_mo);
        button3 = findViewById(R.id.button_hejamat);
        button4 = findViewById(R.id.button_tagzie);
        button5 = findViewById(R.id.button_badan);
        button6 = findViewById(R.id.button_damnosh);
        button7 = findViewById(R.id.button_boo);
        button8 = findViewById(R.id.button_zibai);
        button9 = findViewById(R.id.button_chagi);
        button10 = findViewById(R.id.button_jensi);
        button11 = findViewById(R.id.button_osotikhan);
        button13 = findViewById(R.id.button_srama);
        button15 = findViewById(R.id.button_dandan);
        button16 = findViewById(R.id.button_ofonat);
        button17 = findViewById(R.id.button_Post);
        button18 = findViewById(R.id.button_kamar);
        button19 = findViewById(R.id.button_garma);
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
                startActivity(new Intent(MainActivity.this, Jensi.class));
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

        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.eliyateam.ir/cronastats.php?output=json&country=iran").build();
        RetrofitApiService retrofitApiService= retrofit.create(RetrofitApiService.class);
        retrofitApiService.getPeople().enqueue(new Callback<List<People>>() {
            @Override
            public void onResponse(Call<List<People>> call, Response<List<People>> response) {
                recyclerView = findViewById(R.id.rv_covid);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false));
                adapter = new Adapter(response.body());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<People>> call, Throwable t) {

            }
        });
    }
}

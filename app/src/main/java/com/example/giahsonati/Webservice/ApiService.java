package com.example.giahsonati.Webservice;

import com.example.giahsonati.aoi.People;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("cronastats.php")
    Call<List<People>>getMain();


}

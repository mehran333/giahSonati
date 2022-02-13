package com.example.giahsonati.aoi;

import androidx.recyclerview.widget.LinearSmoothScroller;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiService {
    @GET("cronastats")
    Call<List<People>> getPeople();



}

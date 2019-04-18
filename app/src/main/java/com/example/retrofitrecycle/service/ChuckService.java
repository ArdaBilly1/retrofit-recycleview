package com.example.retrofitrecycle.service;

import com.example.retrofitrecycle.model.ChuckNorrisQuote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ChuckService {
    @GET ("jokes/random")
    Call<ChuckNorrisQuote> getQuote();
}

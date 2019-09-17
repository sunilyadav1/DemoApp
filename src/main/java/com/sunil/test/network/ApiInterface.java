package com.sunil.test.network;

import com.sunil.test.model.MovieDetails;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiInterface {

    @GET("/")
    Call<MovieDetails> getMovieList(@QueryMap Map<String, String> map);
}

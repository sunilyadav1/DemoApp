package com.sunil.test.network;

import com.sunil.test.model.GetMovieRespons;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiInterface {

    @GET("/")
    Call<GetMovieRespons>getMoviewList(@QueryMap Map<String,String> map);
    //Call<GetMovieRespons>getMoviewList(@Query("i") String indexKey,@Query("apikey")String apiKey);
}

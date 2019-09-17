package com.sunil.test.activity.ui;

import com.sunil.test.activity.base.BaseInteractorImpl;
import com.sunil.test.model.GetMovieRespons;
import com.sunil.test.network.RestClient;
import com.sunil.test.utile.CommenUtile;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeInteractorImpl extends BaseInteractorImpl implements HomeInteractor {


    @Override
    public void getMovieList(final ApiListener mApiListener) {
        Map<String,String>map=new HashMap<>();
        map.put("i",CommenUtile.INDEXKEY);
        map.put("apikey",CommenUtile.API_KEY);
        map.put("type","movie");
        RestClient.getApiInterface().getMoviewList(map).enqueue(new Callback<GetMovieRespons>() {
            @Override
            public void onResponse(final Call<GetMovieRespons> call, final Response<GetMovieRespons> response) {
                mApiListener.onSuccess(response.toString());
            }

            @Override
            public void onFailure(final Call<GetMovieRespons> call, final Throwable t) {
                mApiListener.onFailure(t);
            }
        });
    }
}

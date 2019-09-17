package com.sunil.test.activity.ui;

import com.sunil.test.model.MovieDetails;
import com.sunil.test.network.RestClient;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.sunil.test.util.CommonUtils.KEY_API;
import static com.sunil.test.util.CommonUtils.KEY_INDEX;
import static com.sunil.test.util.CommonUtils.KEY_TYPE;
import static com.sunil.test.util.CommonUtils.VALUE_API;
import static com.sunil.test.util.CommonUtils.VALUE_INDEX;
import static com.sunil.test.util.CommonUtils.VALUE_TYPE;

public class HomeInteractorImpl implements HomeInteractor {

    @Override
    public void getMovieList(final ApiListener mApiListener) {
        Map<String, String> map = new HashMap<>();
        map.put(KEY_INDEX, VALUE_INDEX);
        map.put(KEY_API, VALUE_API);
        map.put(KEY_TYPE, VALUE_TYPE);
        RestClient.getApiInterface().getMovieList(map).enqueue(new Callback<MovieDetails>() {
            @Override
            public void onResponse(final Call<MovieDetails> call, final Response<MovieDetails> response) {
                mApiListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(final Call<MovieDetails> call, final Throwable t) {
                mApiListener.onFailure(t);
            }
        });
    }
}

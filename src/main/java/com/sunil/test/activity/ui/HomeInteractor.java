package com.sunil.test.activity.ui;

import com.sunil.test.model.MovieDetails;

public interface HomeInteractor {
    /**
     * The interface Api listener.
     */
    interface ApiListener {

        void onSuccess(final MovieDetails getMovieRespons);


        void onFailure(final Throwable t);
    }

    void getMovieList(ApiListener mApiListener);
}

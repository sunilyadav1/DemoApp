package com.sunil.test.activity.ui;

import com.sunil.test.activity.base.BaseInteractor;

public interface HomeInteractor extends BaseInteractor {
    void getMovieList(ApiListener mApiListener);
}

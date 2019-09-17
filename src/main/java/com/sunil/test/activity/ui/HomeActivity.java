package com.sunil.test.activity.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.sunil.test.R;
import com.sunil.test.activity.base.BaseActivity;

public class HomeActivity extends BaseActivity implements HomeView{
    private HomePresenter homePresenter;
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homePresenter=new HomePresenterImpl(this);
        homePresenter.onAttach();
        homePresenter.getMovieList();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.onDetach();
    }
}

package com.sunil.test.activity.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;

import com.sunil.test.R;
import com.sunil.test.model.MovieDetails;

public class HomeActivity extends AppCompatActivity implements HomeView {
    private HomePresenter homePresenter;
    private TextViewCompat txtMovieName,txtDate,txtDirector,txtWriter,txtRated,txtDescription;
    private ImageViewCompat ivMovieBanar;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initComponent();
        homePresenter = new HomePresenterImpl(this);
        homePresenter.onAttach();
        homePresenter.getMovieList();

    }

    private void initComponent() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.onDetach();
    }

    @Override
    public void movieDetailsApiResponse(final MovieDetails response) {

    }
}

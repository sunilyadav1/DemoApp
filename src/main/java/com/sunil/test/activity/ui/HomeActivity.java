package com.sunil.test.activity.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;
import com.sunil.test.R;
import com.sunil.test.model.MovieDetails;

public class HomeActivity extends AppCompatActivity implements HomeView {
    private HomePresenter homePresenter;
    private AppCompatTextView txtMovieName, txtDate, txtDirector, txtWriter,
            txtRated, txtActors, txtPlot, txtAwards, txtBoxOffice, txtProduction, txtWebsite;
    private AppCompatImageView ivMovieBanar;

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
        txtMovieName = findViewById(R.id.txtMovieName);
        txtDate = findViewById(R.id.txtDate);
        txtDirector = findViewById(R.id.txtDirector);
        txtWriter = findViewById(R.id.txtWriter);
        txtRated = findViewById(R.id.txtRated);
        txtActors = findViewById(R.id.txtActors);
        ivMovieBanar = findViewById(R.id.ivMovieBanar);
        txtPlot = findViewById(R.id.txtPlot);
        txtAwards = findViewById(R.id.txtAwards);
        txtBoxOffice = findViewById(R.id.txtBoxOffice);
        txtProduction = findViewById(R.id.txtProduction);
        txtWebsite = findViewById(R.id.txtWebsite);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.onDetach();
    }

    @Override
    public void movieDetailsApiResponse(final MovieDetails response) {
        Glide.with(this).load(response.getPoster()).into(ivMovieBanar);
        txtMovieName.setText(response.getTitle());
        txtDate.setText(getString(R.string.lable_year) + response.getReleased());
        txtDirector.setText(getString(R.string.lable_director) + response.getDirector());
        txtWriter.setText(getString(R.string.lable_writer) + response.getWriter());
        txtRated.setText(getString(R.string.lable_rated) + response.getRated());
        txtActors.setText(getString(R.string.lable_actors) + response.getActors());
        txtPlot.setText(getString(R.string.lable_plot) + response.getPlot());
        txtAwards.setText(getString(R.string.lable_awards) + response.getAwards());
        txtBoxOffice.setText(getString(R.string.lable_boxoffice) + response.getBoxOffice());
        txtProduction.setText(getString(R.string.lable_production) + response.getProduction());
        txtWebsite.setText(getString(R.string.lable_webside) + response.getWebsite());

    }
}

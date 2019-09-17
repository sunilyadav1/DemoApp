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
    private AppCompatTextView txtMovieName, txtDate, txtDirector, txtWriter, txtRated, txtActors,txtPlot,txtAwards;
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

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.onDetach();
    }

    @Override
    public void movieDetailsApiResponse(final MovieDetails response) {
        Glide.with(this).load(response.getPoster()).into(ivMovieBanar);
        ivMovieBanar.setAdjustViewBounds(true);
        txtMovieName.setText(response.getTitle());
        txtDate.setText("Year: "+response.getReleased());
        txtDirector.setText("Director: "+response.getDirector());
        txtWriter.setText("Writer: "+response.getWriter());
        txtRated.setText("Rated: "+response.getRated());
        txtActors.setText("Actors: "+response.getActors());
        txtPlot.setText("Plot: "+response.getPlot());
        txtAwards.setText("Awards: "+response.getAwards());

    }
}

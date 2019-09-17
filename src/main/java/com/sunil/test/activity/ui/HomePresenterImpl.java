package com.sunil.test.activity.ui;

import com.sunil.test.model.MovieDetails;

public class HomePresenterImpl implements HomePresenter {
    private boolean mIsViewAttached = true;
    private HomeInteractor homeInteractor;
    private HomeView homeView;

    public HomePresenterImpl(final HomeView homeView) {
        this.homeView = homeView;
        this.homeInteractor = new HomeInteractorImpl();

    }

    @Override
    public void onAttach() {
        mIsViewAttached = true;
    }

    @Override
    public void onDetach() {
        mIsViewAttached = true;
    }

    @Override
    public void getMovieList() {
        homeInteractor.getMovieList(new HomeInteractor.ApiListener() {
            @Override
            public void onSuccess(final MovieDetails response) {
                homeView.movieDetailsApiResponse(response);
            }

            @Override
            public void onFailure(final Throwable t) {

            }
        });
    }
}

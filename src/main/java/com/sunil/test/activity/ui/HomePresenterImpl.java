package com.sunil.test.activity.ui;

import com.sunil.test.activity.base.BaseInteractor;
import com.sunil.test.activity.base.BasePresenterImpl;

public class HomePresenterImpl extends BasePresenterImpl implements HomePresenter {
    private HomeInteractor homeInteractor;
    private HomeView homeView;

    public HomePresenterImpl(final HomeView homeView){
        this.homeView=homeView;
        this.homeInteractor=new HomeInteractorImpl();

    }

    @Override
    public void getMovieList() {
        homeInteractor.getMovieList(new BaseInteractor.ApiListener() {
            @Override
            public void onSuccess(final String s) {

            }

            @Override
            public void onFailure(final Throwable t) {

            }
        });
    }
}

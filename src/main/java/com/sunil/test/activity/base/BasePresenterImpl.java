package com.sunil.test.activity.base;


public class BasePresenterImpl implements BasePresenter {

    private boolean mIsViewAttached;




    /**
     * Checks if the view is attached
     *
     * @return true if view is attached else false
     */
    public boolean isViewAttached() {
        return mIsViewAttached;
    }

    @Override
    public void onAttach() {
        mIsViewAttached = true;
    }

    @Override
    public void onDetach() {
        mIsViewAttached = false;
    }
}

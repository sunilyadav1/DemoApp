package com.sunil.test.activity.base;

/**
 * Developer: Click Labs
 */
public interface BasePresenter {

    /**
     * Indicates when the view has attached ( created )
     */
    void onAttach();

    /**
     * Indicates when the view has detached ( destroyed )
     */
    void onDetach();
}

package com.sunil.test.activity.base;


/**
 * Developer: Click Labs
 */
public interface BaseInteractor {

    /**
     * The interface Api listener.
     */
    interface ApiListener {

        void onSuccess(final String s);


        void onFailure(final Throwable t);
    }
}

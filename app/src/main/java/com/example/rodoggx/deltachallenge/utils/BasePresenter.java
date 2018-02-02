package com.example.rodoggx.deltachallenge.utils;

/**
 * Created by RodoggX on 2/2/2018.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V v);

    void detachView();

}

package com.example.rodoggx.deltachallenge.di;

import com.example.rodoggx.deltachallenge.view.PostActivity;

import dagger.Component;

/**
 * Created by RodoggX on 2/2/2018.
 */

@Component(modules = PostModule.class)
public interface PostComponent {

    void inject(PostActivity postActivity);


}

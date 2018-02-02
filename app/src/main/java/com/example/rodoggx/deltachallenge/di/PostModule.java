package com.example.rodoggx.deltachallenge.di;

import com.example.rodoggx.deltachallenge.view.PostPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RodoggX on 2/2/2018.
 */

@Module
public class PostModule {

    @Provides
    PostPresenter providerPostPresenter(){
        return new PostPresenter();
    }
}

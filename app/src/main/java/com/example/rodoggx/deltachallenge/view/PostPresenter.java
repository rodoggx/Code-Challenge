package com.example.rodoggx.deltachallenge.view;

import com.example.rodoggx.deltachallenge.data.RemoteDataSource;
import com.example.rodoggx.deltachallenge.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by RodoggX on 2/2/2018.
 */

public class PostPresenter implements PostContract.Presenter {

    PostContract.View view;

    @Override
    public void attachView(PostContract.View view) {

        this.view = view;
    }

    @Override
    public void detachView() {

        this.view = null;
    }

    @Override
    public void getPosts() {

        RemoteDataSource.getResponse().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, retrofit2.Response<List<Post>> response) {

                view.onPostReceived(response.body());
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

                view.showError(t.toString());
            }
        });

    }
}

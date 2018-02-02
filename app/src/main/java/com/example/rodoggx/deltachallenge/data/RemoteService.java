package com.example.rodoggx.deltachallenge.data;

import com.example.rodoggx.deltachallenge.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RodoggX on 2/2/2018.
 */

public interface RemoteService {

    @GET("posts")
    Call<List<Post>> getResponse();
}

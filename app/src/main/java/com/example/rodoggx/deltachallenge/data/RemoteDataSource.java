package com.example.rodoggx.deltachallenge.data;

import com.example.rodoggx.deltachallenge.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RodoggX on 2/2/2018.
 */

public class RemoteDataSource {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    public static Retrofit create(){

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Call<List<Post>> getResponse(){

        Retrofit retrofit = create();
        RemoteService remoteService = retrofit.create(RemoteService.class);
        return remoteService.getResponse();
    }


}

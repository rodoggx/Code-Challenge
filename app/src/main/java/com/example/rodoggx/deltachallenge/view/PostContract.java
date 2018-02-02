package com.example.rodoggx.deltachallenge.view;

import com.example.rodoggx.deltachallenge.model.Post;
import com.example.rodoggx.deltachallenge.utils.BasePresenter;
import com.example.rodoggx.deltachallenge.utils.BaseView;

import java.util.List;

/**
 * Created by RodoggX on 2/2/2018.
 */

public interface PostContract {


    //implement in activyt
    interface View extends BaseView {

        void onPostReceived(List<Post> postList);
    }

    interface Presenter extends BasePresenter<View> {

        //call from activity
        void getPosts();
    }

}

package com.example.rodoggx.deltachallenge.view;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodoggx.deltachallenge.R;
import com.example.rodoggx.deltachallenge.model.Post;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by RodoggX on 2/2/2018.
 */

public class PostRecyclerAdapter  extends RecyclerView.Adapter<PostRecyclerAdapter.MyViewHolder> {

    List<Post> postList;

    public PostRecyclerAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Post post = postList.get(position);

        Log.d(TAG, "onBindViewHolder: "+ post.toString());

        //bind the views
        holder.userId.setText(post.getUserId());
        holder.id.setText(post.getId());
        holder.body.setText(post.getBody());
        holder.title.setText(post.getTitle());

    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: "+ postList.size());
        return postList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView userId;
        TextView id;
        TextView title;
        TextView body;

        public MyViewHolder(View itemView) {
            super(itemView);
            userId = itemView.findViewById(R.id.tvUserId);
            id= itemView.findViewById(R.id.tvId);
            title = itemView.findViewById(R.id.tvTitle);
            body = itemView.findViewById(R.id.tvBody);
        }
    }
}

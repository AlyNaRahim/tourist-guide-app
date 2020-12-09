package com.example.projectapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private List <PostItem> postItems;

    public PostsAdapter(List<PostItem> postItems) {
        this.postItems = postItems;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item_container, parent,false));
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        final PostItem eatDrink = postItems.get(position);

        holder.title2.setText(eatDrink.getTitle());
        holder.genre.setText(eatDrink.getSubHeading());
        holder.rating.setRating((float) eatDrink.getRating());
        holder.postImageView.setBackgroundResource(eatDrink.getImage());

    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{
        private ImageView postImageView;
        private TextView title2, genre;
        private RatingBar rating;

        public PostViewHolder(@NonNull final View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.view2);
            title2 = itemView.findViewById(R.id.textView9);
            genre = itemView.findViewById(R.id.textView10);
            rating = itemView.findViewById(R.id.ratingBar2);

        }

        void setPostImage (PostItem postItem){
            postImageView.setImageResource(postItem.getImage());
        }
    }
}

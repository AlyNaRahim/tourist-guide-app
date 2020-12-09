package com.example.projectapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter <HotelAdapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<PostItem> hotels;

    HotelAdapter(Context context, List<PostItem> hotels) {
        this.layoutInflater = LayoutInflater.from(context);
        this.hotels = hotels;
    }


    @Override
    public HotelAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view_hotels, parent, false);
        return new HotelAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        final PostItem accommodation = hotels.get(position);

        viewHolder.title3.setText(accommodation.getTitle());
        viewHolder.genre.setText(accommodation.getSubHeading());
        viewHolder.rating.setRating((float) accommodation.getRating());
        viewHolder.imageView.setBackgroundResource(accommodation.getImage());
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title3, genre;
        RatingBar rating;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.viewhotel);
            title3 = itemView.findViewById(R.id.textViewHotel2);
            genre = itemView.findViewById(R.id.textViewHotel3);
            rating = itemView.findViewById(R.id.ratingBar3);

        }

        void setPostImage (PostItem postItem){
            imageView.setImageResource(postItem.getImage());
        }
    }
}

package com.example.projectapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view_accom, parent, false);
        return new HotelAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        final PostItem accommodation = hotels.get(position);

        viewHolder.title3.setText(accommodation.getTitle());
        viewHolder.genreh.setText(accommodation.getSubHeading());
        viewHolder.ratingh.setRating((float) accommodation.getRating());
        viewHolder.imageViewh.setBackgroundResource(accommodation.getImage());
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewh;
        private TextView title3, genreh;
        private RatingBar ratingh;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(),DetailActivity.class);
                    i.putExtra("title", hotels.get(getAdapterPosition()).getTitle());
                    i.putExtra("image", hotels.get(getAdapterPosition()).getImage());
                    v.getContext().startActivity(i);
                }
            });
            imageViewh = itemView.findViewById(R.id.viewhotel);
            title3 = itemView.findViewById(R.id.textViewHotel2);
            genreh = itemView.findViewById(R.id.textViewHotel3);
            ratingh = itemView.findViewById(R.id.ratingBar3);


        }

        void setPostImage (PostItem postItem){
            imageViewh.setImageResource(postItem.getImage());
        }

    }
}

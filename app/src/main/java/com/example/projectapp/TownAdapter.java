package com.example.projectapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class TownAdapter extends RecyclerView.Adapter <TownAdapter.ViewHolder>{

    private LayoutInflater layoutInflater;
    //private List <String> data;
    private List<TownCardItem> items;

   TownAdapter(Context context, List<TownCardItem> items){
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
    }

    /*HotelAdapter(List<HotelCardItem> items) {
        //this.layoutInflater = LayoutInflater.from(context);
        this.items = items; */


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view_towns,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        final TownCardItem town = items.get(position);

        viewHolder.textTitle.setText(town.getTitle());
        viewHolder.image.setBackgroundResource(town.getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textTitle;
        private  ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textView5);
            image = itemView.findViewById(R.id.view);
        }
    }
}
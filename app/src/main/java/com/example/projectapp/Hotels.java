package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Hotels extends AppCompatActivity {

    private RecyclerView recyclerViewHotels;
    private HotelAdapter adapter;
    private List<PostItem> hotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        RecyclerView recyclerViewHotels = findViewById(R.id.rcviewHotels);
        recyclerViewHotels.setLayoutManager(new GridLayoutManager(this, 2));

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem("Oyster Restaurant Morya", "Seafood, European", 4.9f, R.drawable.food1));
        postItems.add(new PostItem("Barashek", "Local, Asian", 4.5f, R.drawable.food2));
        postItems.add(new PostItem("Baan Baan Cafe", "Thai", 4.5f, R.drawable.food3));
        postItems.add(new PostItem("Ethnic Cafe Dastorkon", "Local, Asian", 3.9f, R.drawable.issykkul));
        postItems.add(new PostItem("Obama Bar & Grill", "American bar", 4.2f, R.drawable.chuii));
        postItems.add(new PostItem("Meat Point", "Steakhouse, Bar", 3.0f, R.drawable.food6));
        postItems.add(new PostItem("Bellagio Coffee Manas", "Italian, Pizza", 4.5f, R.drawable.food7));
        postItems.add(new PostItem("Burger House", "Quick Bites, American", 3.8f, R.drawable.food8));
        postItems.add(new PostItem("Cafe Ken Bok Kun", "Korean, Asian", 3.7f, R.drawable.food9));
        postItems.add(new PostItem("Papa Roti", "Indian, South Asian", 4.9f, R.drawable.food10));
        postItems.add(new PostItem("Oyster Restaurant Morya", "Seafood, European", 4.9f, R.drawable.food1));
        postItems.add(new PostItem("Barashek", "Local, Asian", 4.5f, R.drawable.food2));
        postItems.add(new PostItem("Baan Baan Cafe", "Thai", 4.5f, R.drawable.food3));
        postItems.add(new PostItem("Ethnic Cafe Dastorkon", "Local, Asian", 3.9f, R.drawable.food4));
        postItems.add(new PostItem("Obama Bar & Grill", "American bar", 4.2f, R.drawable.food5));
        postItems.add(new PostItem("Meat Point", "Steakhouse, Bar", 3.0f, R.drawable.food6));
        postItems.add(new PostItem("Bellagio Coffee Manas", "Italian, Pizza", 4.5f, R.drawable.food7));
        postItems.add(new PostItem("Burger House", "Quick Bites, American", 3.8f, R.drawable.food8));
        postItems.add(new PostItem("Cafe Ken Bok Kun", "Korean, Asian", 3.7f, R.drawable.food9));
        postItems.add(new PostItem("Papa Roti", "Indian, South Asian", 4.9f, R.drawable.food10));

        recyclerViewHotels.setAdapter(new PostsAdapter(postItems));
    }
}
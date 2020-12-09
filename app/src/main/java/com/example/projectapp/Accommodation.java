package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Accommodation extends AppCompatActivity {

    private RecyclerView recyclerViewHotels;
    private HotelAdapter adapter;
    private List<PostItem> hotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);


        RecyclerView recyclerViewHotels = findViewById(R.id.rcviewHotels);
        recyclerViewHotels.setLayoutManager(new GridLayoutManager(this, 2));

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem("Khan Tengri", "Breakfast included", 4.9f, R.drawable.tengri));
        postItems.add(new PostItem("Akun Hotel", "Breakfast included", 4.9f, R.drawable.akun));
        postItems.add(new PostItem("Aska Hotel", "Breakfast and pool included", 4.5f, R.drawable.aska));
        postItems.add(new PostItem("Boutique Hotel Bishkek", "Breakfast included", 4.5f, R.drawable.boutique));
        postItems.add(new PostItem("Dastaan", "Breakfast included", 3.9f, R.drawable.dastan));
        postItems.add(new PostItem("Evrazia", "Breakfast included", 4.2f, R.drawable.evrazia));
        postItems.add(new PostItem("Grand Hotel", "Breakfast included", 3.0f, R.drawable.grand));
        postItems.add(new PostItem("Janaat Resorts", "Breakfast included", 4.5f, R.drawable.jannat));
        postItems.add(new PostItem("My Hotel", "Breakfast included", 3.8f, R.drawable.myhotel));
        postItems.add(new PostItem("Orient Hotel", "Meals included", 3.7f, R.drawable.orient));
        postItems.add(new PostItem("Remi Hotel", "Breakfast included", 4.9f, R.drawable.remi));
        postItems.add(new PostItem("Khan Tengri", "Breakfast included", 4.9f, R.drawable.tengri));
        postItems.add(new PostItem("Khan Tengri", "Breakfast included", 4.9f, R.drawable.tengri));
        postItems.add(new PostItem("Akun Hotel", "Breakfast included", 4.9f, R.drawable.akun));
        postItems.add(new PostItem("Aska Hotel", "Breakfast and pool included", 4.5f, R.drawable.aska));
        postItems.add(new PostItem("Boutique Hotel Bishkek", "Breakfast included", 4.5f, R.drawable.boutique));
        postItems.add(new PostItem("Dastaan", "Breakfast included", 3.9f, R.drawable.dastan));
        postItems.add(new PostItem("Evrazia", "Breakfast included", 4.2f, R.drawable.evrazia));
        postItems.add(new PostItem("Grand Hotel", "Breakfast included", 3.0f, R.drawable.grand));
        postItems.add(new PostItem("Janaat Resorts", "Breakfast included", 4.5f, R.drawable.jannat));
        postItems.add(new PostItem("My Hotel", "Breakfast included", 3.8f, R.drawable.myhotel));
        postItems.add(new PostItem("Orient Hotel", "Meals included", 3.7f, R.drawable.orient));
        postItems.add(new PostItem("Remi Hotel", "Breakfast included", 4.9f, R.drawable.remi));
        postItems.add(new PostItem("Khan Tengri", "Breakfast included", 4.9f, R.drawable.tengri));

        recyclerViewHotels.setAdapter(new HotelAdapter(this,postItems));

    }
}
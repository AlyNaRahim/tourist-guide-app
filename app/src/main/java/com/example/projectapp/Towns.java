package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Towns extends AppCompatActivity {
    private RecyclerView recyclerViewTowns;
    private TownAdapter adapter;
    private List<TownCardItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_towns);

        List<TownCardItem> items = new ArrayList<>();
        items.add(new TownCardItem("Batken", R.drawable.batken));
        items.add(new TownCardItem("Issykkul", R.drawable.issykkul));
        items.add(new TownCardItem("Bishkek",  R.drawable.bishkek));
        items.add(new TownCardItem("Naryn", R.drawable.naryn));
        items.add(new TownCardItem("Chuii", R.drawable.chuii));
        items.add(new TownCardItem("Osh", R.drawable.osh));
        items.add(new TownCardItem("Talas", R.drawable.talas));
        items.add(new TownCardItem("Jalalabad", R.drawable.jalalabad));


        recyclerViewTowns = findViewById(R.id.rcviewHotels);
        recyclerViewTowns.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TownAdapter(this, items);
        recyclerViewTowns.setAdapter(adapter);
    }
}
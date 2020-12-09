package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        items.add(new TownCardItem("BATKEN", R.drawable.batken));
        items.add(new TownCardItem("ISSYK-KUL", R.drawable.issykkul));
        items.add(new TownCardItem("BISHKEK",  R.drawable.bishkek));
        items.add(new TownCardItem("NARYN", R.drawable.naryn));
        items.add(new TownCardItem("OSH", R.drawable.osh));
        items.add(new TownCardItem("TALAS", R.drawable.talas));
        items.add(new TownCardItem("JALALABAD", R.drawable.jalalabad));
        items.add(new TownCardItem("CHUII", R.drawable.chuii));


        recyclerViewTowns = findViewById(R.id.rcviewTowns);
        recyclerViewTowns.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TownAdapter(this, items);
        recyclerViewTowns.setAdapter(adapter);
    }
}
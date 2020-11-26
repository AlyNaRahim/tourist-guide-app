package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        RecyclerView postsRecyclerView = findViewById(R.id.postsRecyclerView);
        postsRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        List <PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.batken));
        postItems.add(new PostItem(R.drawable.bishkek));
        postItems.add(new PostItem(R.drawable.issykkul));
        postItems.add(new PostItem(R.drawable.jalalabad));
        postItems.add(new PostItem(R.drawable.naryn));
        postItems.add(new PostItem(R.drawable.talas));
        postItems.add(new PostItem(R.drawable.osh));
        postItems.add(new PostItem(R.drawable.chuii));

        postsRecyclerView.setAdapter(new PostsAdapter(postItems));


    }
}
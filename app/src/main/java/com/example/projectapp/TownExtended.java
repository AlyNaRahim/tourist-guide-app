package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TownExtended extends AppCompatActivity {
    TextView textTitle;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town_extended);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        image = findViewById(R.id.header_background2);
        textTitle = findViewById(R.id.about);

        image.setImageResource(getIntent().getIntExtra("image",0));
        textTitle.setText(title);
    }
}
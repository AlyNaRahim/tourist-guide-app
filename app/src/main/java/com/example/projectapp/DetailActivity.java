package com.example.projectapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView textTitle;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_view);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        image = findViewById(R.id.header_background);
        textTitle = findViewById(R.id.third_title);

        image.setImageResource(getIntent().getIntExtra("image",0));
        textTitle.setText(title);

    }
}

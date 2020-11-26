package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView setTime;
    TextView setDate;
    CardView destination, eatDrink, accommodation, tours, events, more;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTime = findViewById(R.id.time);
        setDate = findViewById(R.id.date);
        destination = findViewById(R.id.destination);
        eatDrink = findViewById(R.id.eatAndDrink);
        accommodation = findViewById(R.id.accommodation);
        tours = findViewById(R.id.tours);
        events = findViewById(R.id.events);
        more = findViewById(R.id.more);



        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String time = simpleTimeFormat.format(calendar.getTime());
        String date = simpleDateFormat.format(calendar.getTime());
        setTime.setText(time);
        setDate.setText(date);

        destination.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,DestinationActivity.class);
        startActivity(intent);
    }
}

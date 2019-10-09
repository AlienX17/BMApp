package com.example.bmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout restaurants = findViewById(R.id.restaurants_category);

        restaurants.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent restaurantsIntent = new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(restaurantsIntent);

            }
        });
    }

    public void openMuseumsList(View view){
        Intent i = new Intent(this, MuseumsActivity.class);
        startActivity(i);
    }

    public void openClubsList(View view){
        Intent i = new Intent(this, ClubsActivity.class);
        startActivity(i);
    }

    public void openParksList(View view){
        Intent i = new Intent(this, ParksActivity.class);
        startActivity(i);
    }
}

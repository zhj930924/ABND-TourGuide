package com.example.android.exploreshanghai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore);

        //Navigate to Attraction Activity
        ImageView attractionButton = (ImageView) findViewById(R.id.button_attraction);

        attractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open {@link AttractionActivity}
                Intent attractionIntent =
                        new Intent(ExploreActivity.this, AttractionActivity.class);

                startActivity(attractionIntent);
            }
        });

        //Navigate to Hotel Activity
        ImageView hotelButton = (ImageView) findViewById(R.id.button_hotel);

        hotelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open {@link HotelActivity}
                Intent hotelIntent =
                        new Intent(ExploreActivity.this, HotelActivity.class);

                startActivity(hotelIntent);
            }
        });

        //Navigate to Food Activity
        ImageView foodButton = (ImageView) findViewById(R.id.button_food);

        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open {@link RestaurantActivity}
                Intent foodIntent =
                        new Intent(ExploreActivity.this, RestaurantActivity.class);

                startActivity(foodIntent);
            }
        });
        
        //Navigate to Favorite Activity
        ImageView favoriteButton = (ImageView) findViewById(R.id.button_favorite);

        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open {@link FavoriteActivity}
                Intent favoriteIntent =
                        new Intent(ExploreActivity.this, FavoriteActivity.class);

                startActivity(favoriteIntent);
            }
        });
    }
}

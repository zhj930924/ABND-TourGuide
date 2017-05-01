package com.example.android.exploreshanghai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    private ArrayList<Restaurant> mRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        initializeRestaurants();

        // Create an {@link FavoriteAdapter}, whose data source is a list of {@link Favorite}s. The
        // adapter knows how to create list items for each item in the list.
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, mRestaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list
        ListView listView = (ListView) findViewById(R.id.location_list_view);

        // Make the {@link ListView} use the {@link FavoriteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Favorite} in the list.
        listView.setAdapter(restaurantAdapter);
    }

    private void initializeRestaurants() {
        mRestaurants = new ArrayList<>();
        mRestaurants.add(new Restaurant(
                getString(R.string.restaurant_0_name), R.drawable.food_0,
                R.drawable.ic_heart_5, getString(R.string.restaurant_0_address)));

        mRestaurants.add(new Restaurant(
                getString(R.string.restaurant_1_name), R.drawable.food_1,
                R.drawable.ic_heart_5));

        mRestaurants.add(new Restaurant(
                getString(R.string.restaurant_2_name), R.drawable.food_2,
                R.drawable.ic_heart_4, getString(R.string.restaurant_2_address)));
    }
}

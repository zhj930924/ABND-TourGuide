package com.example.android.exploreshanghai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    private ArrayList<Hotel> mHotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        initializeHotels();

        // Create an {@link HotelAdapter}, whose data source is a list of {@link Hotel}s. The
        // adapter knows how to create list items for each item in the list.
        HotelAdapter hotelAdapter = new HotelAdapter(this, mHotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list
        ListView listView = (ListView) findViewById(R.id.location_list_view);

        // Make the {@link ListView} use the {@link HotelAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Hotel} in the list.
        listView.setAdapter(hotelAdapter);
    }

    private void initializeHotels() {
        mHotels = new ArrayList<>();
        mHotels.add(new Hotel(
                getString(R.string.hotel_0_name), R.drawable.hotel_0,
                R.drawable.ic_heart_5, getString(R.string.hotel_0_address)));
        mHotels.add(new Hotel(
                getString(R.string.hotel_1_name), R.drawable.hotel_1,
                R.drawable.ic_heart_4 , getString(R.string.hotel_1_address)));
        mHotels.add(new Hotel(
                getString(R.string.hotel_2_name), R.drawable.hotel_2,
                R.drawable.ic_heart_5, getString(R.string.hotel_2_address)));
        mHotels.add(new Hotel(
                getString(R.string.hotel_3_name), R.drawable.hotel_3,
                R.drawable.ic_heart_4, getString(R.string.hotel_3_address)));
    }
}

package com.example.android.exploreshanghai;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jing Zhang on 4/29/2017.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }

        // Get the {@link Restaurant} object located at this position in the list
        Restaurant currentRestaurant = getItem(position);

        // Find the proper ImageView to display the main image of the current Restaurant
        ImageView mainImageView = (ImageView) listItemView.findViewById(R.id.location_image);

        mainImageView.setImageResource(currentRestaurant.getImageResourceId());

        mainImageView.setVisibility(View.VISIBLE);

        // Find the proper TextView to display the name of the current Restaurant
        TextView textView = (TextView) listItemView.findViewById(R.id.location_name);
        textView.setText(currentRestaurant.getName());

        // Find the proper ImageView to display the rating of the current Restaurant
        ImageView ratingImageView = (ImageView) listItemView.findViewById(R.id.location_rating);

        ratingImageView.setImageResource(currentRestaurant.getRatingImageResourceId());

        ratingImageView.setVisibility(View.VISIBLE);

        // Find the proper TextView to display the address of the current Restaurant if there's one
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.location_address);

        if (currentRestaurant.hasAddress()) {
            addressTextView.setText(currentRestaurant.getAddress());
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        // Return the whole list item layout  so that it can be shown in ListView.
        return listItemView;
    }
}


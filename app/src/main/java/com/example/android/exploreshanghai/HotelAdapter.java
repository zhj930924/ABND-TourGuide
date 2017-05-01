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

public class HotelAdapter extends ArrayAdapter<Hotel> {

    public HotelAdapter(Context context, ArrayList<Hotel> hotels) {
        super(context, 0, hotels);
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

        // Get the {@link Hotel} object located at this position in the list
        Hotel currentHotel = getItem(position);

        // Find the proper ImageView to display the main image of the current Hotel
        ImageView mainImageView = (ImageView) listItemView.findViewById(R.id.location_image);

        mainImageView.setImageResource(currentHotel.getImageResourceId());

        mainImageView.setVisibility(View.VISIBLE);

        // Find the proper TextView to display the name of the current Hotel
        TextView textView = (TextView) listItemView.findViewById(R.id.location_name);
        textView.setText(currentHotel.getName());

        // Find the proper ImageView to display the rating of the current Hotel
        ImageView ratingImageView = (ImageView) listItemView.findViewById(R.id.location_rating);

        ratingImageView.setImageResource(currentHotel.getRatingImageResourceId());

        ratingImageView.setVisibility(View.VISIBLE);

        // Find the proper TextView to display the address of the current Hotel if there's one
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.location_address);
        
        addressTextView.setText(currentHotel.getAddress());

        // Return the whole list item layout  so that it can be shown in ListView.
        return listItemView;
    }
}


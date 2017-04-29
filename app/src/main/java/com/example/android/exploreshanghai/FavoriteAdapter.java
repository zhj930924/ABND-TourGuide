package com.example.android.exploreshanghai;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Jing Zhang on 4/29/2017.
 */

public class FavoriteAdapter extends ArrayAdapter<Favorite> {

    public FavoriteAdapter(Context context, ArrayList<Favorite> favorites) {
        super(context, 0, favorites);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.favorite_list_item, parent, false);
        }

        // Get the {@link Favorite} object located at this position in the list
        Favorite currentFavorite = getItem(position);

        // Find the ImageView in the favorite_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.favorite_image);

        // Display the provided image based on the resource ID
        imageView.setImageResource(currentFavorite.getImageResourceId());

        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Return the whole list item layout  so that it can be shown in ListView.
        return listItemView;
    }
}


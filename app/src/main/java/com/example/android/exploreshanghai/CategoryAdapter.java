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

public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        super(context, 0, categories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_list_item, parent, false);
        }

        // Get the {@link Favorite} object located at this position in the list
        Category currentCategory = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.category_text);
        textView.setText(currentCategory.getName());

        // Find the ImageView in the favorite_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.category_image);

        // Display the provided image based on the resource ID
        imageView.setImageResource(currentCategory.getImageResourceId());

        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Return the whole list item layout  so that it can be shown in ListView.
        return listItemView;
    }
}


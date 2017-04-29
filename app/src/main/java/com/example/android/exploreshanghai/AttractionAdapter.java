package com.example.android.exploreshanghai;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jing Zhang on 4/28/2017.
 */

class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder> {

    private ArrayList<Attraction> mAttractions;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item
    public static class AttractionViewHolder extends RecyclerView.ViewHolder {
        CardView mAttractionCardView;
        TextView mAttractionName;
        ImageView mAttractionImage;

        public AttractionViewHolder(View itemView) {
            super(itemView);

            mAttractionCardView = (CardView) itemView.findViewById(R.id.attraction_card_view);
            mAttractionName = (TextView) itemView.findViewById(R.id.attraction_name);
            mAttractionImage = (ImageView) itemView.findViewById(R.id.attraction_image);
        }
    }

    // Provide a suitable constructor
    public AttractionAdapter(ArrayList<Attraction> attractions) {
        mAttractions = attractions;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AttractionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new item view
        View attraction_item_view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attraction_recycler_item, parent, false);

        return new AttractionViewHolder(attraction_item_view);
    }

    // Replace the contents of a view
    @Override
    public void onBindViewHolder(AttractionViewHolder avh, int i) {
        // Get the current Attraction object by its position in the ArrayList
        Attraction currentAttraction = mAttractions.get(i);

        // Get the name for the current Attraction object and set text on the proper TextView
        avh.mAttractionName.setText(currentAttraction.getName());

        // Display the provided image based on the resource ID
        avh.mAttractionImage.setImageResource(currentAttraction.getImageResourceId());
        avh.mAttractionImage.setVisibility(View.VISIBLE);
    }

    // Return the size of the ArrayList<Attraction>
    @Override
    public int getItemCount() {
        return mAttractions.size();
    }
}

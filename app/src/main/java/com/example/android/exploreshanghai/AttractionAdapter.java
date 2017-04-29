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

    // We need our own custom onItemClickListener because there isn't one for a RecyclerView
    public interface OnItemClickListener {
        void onItemClick(Attraction attraction);
    }

    private final ArrayList<Attraction> mAttractions;
    private final OnItemClickListener mOnItemClickListener;

    /**
     * @param attractions         A list of Attraction objects
     * @param onItemClickListener The constructor also receives our custom onItemClickListener that
     *                            implements its interface
     */
    public AttractionAdapter(ArrayList<Attraction> attractions,
                             OnItemClickListener onItemClickListener) {
        mAttractions = attractions;
        mOnItemClickListener = onItemClickListener;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AttractionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new item view
        View attraction_item_view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        return new AttractionViewHolder(attraction_item_view);
    }

    // Replace the contents of a view
    @Override
    public void onBindViewHolder(AttractionViewHolder holder, int position) {
        // Get the current Attraction object by its position in the ArrayList
        Attraction currentAttraction = mAttractions.get(position);

        // Bind the custom onItemClickListener to the current Attraction object
        holder.bind(currentAttraction, mOnItemClickListener);
    }

    // Return the size of the ArrayList<Attraction>
    @Override
    public int getItemCount() {
        return mAttractions.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item
    static class AttractionViewHolder extends RecyclerView.ViewHolder {
        CardView mAttractionCardView;
        TextView mAttractionName;
        ImageView mAttractionImage;

        public AttractionViewHolder(View itemView) {
            super(itemView);

            mAttractionCardView = (CardView) itemView.findViewById(R.id.attraction_card_view);
            mAttractionName = (TextView) itemView.findViewById(R.id.attraction_name);
            mAttractionImage = (ImageView) itemView.findViewById(R.id.attraction_image);
        }

        public void bind(final Attraction attraction, final OnItemClickListener listener) {
            // Get the name for the current Attraction object and set text on the proper TextView
            mAttractionName.setText(attraction.getName());

            // Display the provided image based on the resource ID
            mAttractionImage.setImageResource(attraction.getImageResourceId());
            mAttractionImage.setVisibility(View.VISIBLE);

            // We will use our custom onItemClick listener to "implement" the onClick method
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(attraction);
                }
            });
        }
    }
}

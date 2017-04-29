package com.example.android.exploreshanghai;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class YuGardenReviewFragment extends Fragment {

    public YuGardenReviewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_review, container, false);

        ImageView mapImageView = (ImageView) rootView.findViewById(R.id.review_map);
        mapImageView.setImageResource(R.drawable.yu_garden_map);

        ImageView ratingImageView = (ImageView) rootView.findViewById(R.id.review_ratings);
        ratingImageView.setImageResource(R.drawable.ic_heart_5);

        ImageView imageView31 = (ImageView) rootView.findViewById(R.id.review_image_3_1);
        imageView31.setImageResource(R.drawable.yu_garden_3_1);

        ImageView imageView32 = (ImageView) rootView.findViewById(R.id.review_image_3_2);
        imageView32.setImageResource(R.drawable.yu_garden_3_2);

        ImageView imageView33 = (ImageView) rootView.findViewById(R.id.review_image_3_3);
        imageView33.setImageResource(R.drawable.yu_garden_3_3);

        TextView titleTextView = (TextView) rootView.findViewById(R.id.review_title);
        titleTextView.setText(R.string.yu_garden_title);

        TextView subtitleTextView = (TextView) rootView.findViewById(R.id.review_subtitle);
        subtitleTextView.setText(R.string.yu_garden_subtitle);

        TextView reviewTextView = (TextView) rootView.findViewById(R.id.review_review);
        reviewTextView.setText(R.string.yu_garden_review);

        TextView reviewerTextView = (TextView) rootView.findViewById(R.id.review_reviewer);
        reviewerTextView.setText(R.string.yu_garden_reviewer);

        return rootView;
    }
}

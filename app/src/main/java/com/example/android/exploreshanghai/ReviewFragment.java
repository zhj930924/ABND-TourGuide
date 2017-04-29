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
public class ReviewFragment extends Fragment {

    public ReviewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_review, container, false);

        ImageView mapImageView = (ImageView) rootView.findViewById(R.id.review_map);
        mapImageView.setImageResource(R.drawable.bund_map);

        ImageView ratingImageView = (ImageView) rootView.findViewById(R.id.review_ratings);
        ratingImageView.setImageResource(R.drawable.ic_heart_5);

        ImageView imageView31 = (ImageView) rootView.findViewById(R.id.review_image_3_1);
        imageView31.setImageResource(R.drawable.bund_3_1);

        ImageView imageView32 = (ImageView) rootView.findViewById(R.id.review_image_3_2);
        imageView32.setImageResource(R.drawable.bund_3_2);

        ImageView imageView33 = (ImageView) rootView.findViewById(R.id.review_image_3_3);
        imageView33.setImageResource(R.drawable.bund_3_3);

        TextView titleTextView = (TextView) rootView.findViewById(R.id.review_title);
        titleTextView.setText(R.string.bund_title);

        TextView subtitleTextView = (TextView) rootView.findViewById(R.id.review_subtitle);
        subtitleTextView.setText(R.string.bund_subtitle);

        TextView reviewTextView = (TextView) rootView.findViewById(R.id.review_review);
        reviewTextView.setText(R.string.bund_review);

        TextView reviewerTextView = (TextView) rootView.findViewById(R.id.review_reviewer);
        reviewerTextView.setText(R.string.bund_reviewer);

//        HashMap<String, Integer> resourceMap = new HashMap<>();
//        resourceMap.put("map", R.drawable.bund_map);
//        resourceMap.put("title", R.string.bund_title);
//        resourceMap.put("subtitle", R.string.bund_subtitle);
//        resourceMap.put("ratings", R.drawable.ic_heart_5);
//        resourceMap.put("image_3_1", R.drawable.bund_3_1);
//        resourceMap.put("image_3_2", R.drawable.bund_3_2);
//        resourceMap.put("image_3_3", R.drawable.bund_3_3);
//        resourceMap.put("review", R.string.bund_review);
//        resourceMap.put("reviewer", R.string.bund_reviewer);
//
//        Detail bundDetail = new Detail(resourceMap, "review");
//        for (String key : bundDetail.getKeys()) {
//            int viewId = bundDetail.getViewId(key);
//            int resourceId = bundDetail.getResourceId(key);
//
//            if (bundDetail.isImageView(key)) {
//                // Find the ImageView in the root view layout with specified ID.
//                ImageView imageView = (ImageView) rootView.findViewById(viewId);
//                // If an image is available, display the provided image based on the resource ID
//                imageView.setImageResource(resourceId);
//                // Make sure the view is visible
//                imageView.setVisibility(View.VISIBLE);
//            } else {
//                // Find the TextView in the root view layout with the specified ID.
//                TextView textView = (TextView) rootView.findViewById(viewId);
//                textView.setText(getString(resourceId));
//            }
//        }
        return rootView;
    }
}

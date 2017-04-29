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
public class YuGardenInfoFragment extends Fragment {

    public YuGardenInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_info, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.info_image);
        imageView.setImageResource(R.drawable.yu_garden_desc);

        TextView titleTextView = (TextView) rootView.findViewById(R.id.info_title);
        titleTextView.setText(R.string.yu_garden_title);

        TextView subtitleTextView = (TextView) rootView.findViewById(R.id.info_subtitle);
        subtitleTextView.setText(R.string.yu_garden_subtitle);

        TextView descTextView = (TextView) rootView.findViewById(R.id.info_desc);
        descTextView.setText(R.string.yu_garden_desc);

        TextView lengthTextView = (TextView) rootView.findViewById(R.id.info_length);
        lengthTextView.setText(R.string.yu_garden_length);

        TextView feeTextView = (TextView) rootView.findViewById(R.id.info_fee);
        feeTextView.setText(R.string.yu_garden_fee);

        TextView addressTextView = (TextView) rootView.findViewById(R.id.info_address);
        addressTextView.setText(R.string.yu_garden_address);

        return rootView;
    }
}

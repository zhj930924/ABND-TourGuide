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
public class ZooInfoFragment extends Fragment {

    public ZooInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_info, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.info_image);
        imageView.setImageResource(R.drawable.zoo_desc);

        TextView titleTextView = (TextView) rootView.findViewById(R.id.info_title);
        titleTextView.setText(R.string.zoo_title);

        TextView subtitleTextView = (TextView) rootView.findViewById(R.id.info_subtitle);
        subtitleTextView.setText(R.string.zoo_subtitle);

        TextView descTextView = (TextView) rootView.findViewById(R.id.info_desc);
        descTextView.setText(R.string.zoo_desc);

        TextView lengthTextView = (TextView) rootView.findViewById(R.id.info_length);
        lengthTextView.setText(R.string.zoo_length);

        TextView feeTextView = (TextView) rootView.findViewById(R.id.info_fee);
        feeTextView.setText(R.string.zoo_fee);

        TextView addressTextView = (TextView) rootView.findViewById(R.id.info_address);
        addressTextView.setText(R.string.zoo_address);

        return rootView;
    }
}

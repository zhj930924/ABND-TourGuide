package com.example.android.exploreshanghai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

    private ArrayList<Attraction> mAttractions;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_recycler);

        // Find the RecyclerView by its ID
        mRecyclerView = (RecyclerView) findViewById(R.id.attraction_recycler_view);

        // Improve performance since the layout size of the RecyclerView is fixed
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(ExploreActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Create a list of attractions
        initializeAttractions();

        // specify an adapter
        AttractionAdapter attractionAdapter = new AttractionAdapter(mAttractions);
        mRecyclerView.setAdapter(attractionAdapter);
    }

    private void initializeAttractions() {
        mAttractions = new ArrayList<>();
        mAttractions.add(new Attraction(getString(R.string.bund_name), R.drawable.bund));
        mAttractions.add(new Attraction(getString(R.string.museum_name), R.drawable.museum));
        mAttractions.add(new Attraction(getString(R.string.zoo_name), R.drawable.zoo_3_2));
        mAttractions.add(new Attraction(getString(R.string.yu_garden_name), R.drawable.yu_garden));
        mAttractions.add(new Attraction(getString(R.string.train_name), R.drawable.train));
    }
}

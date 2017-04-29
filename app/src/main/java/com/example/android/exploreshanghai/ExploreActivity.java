package com.example.android.exploreshanghai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

    private ArrayList<Attraction> mAttractions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        // Find the RecyclerView by its ID
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.attraction_recycler_view);

        // Improve performance since the layout size of the RecyclerView is fixed
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(ExploreActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);

        // Create a list of attractions
        initializeAttractions();

        // specify an adapter
        AttractionAdapter attractionAdapter =
                new AttractionAdapter(mAttractions,
                        new AttractionAdapter.OnItemClickListener() {
                            @Override
                            public void onItemClick(Attraction attraction) {
                                String attractionName = attraction.getName();
                                goToAttraction(attractionName);
                            }
                        });
        recyclerView.setAdapter(attractionAdapter);
    }

    private void initializeAttractions() {
        mAttractions = new ArrayList<>();
        mAttractions.add(new Attraction(getString(R.string.bund_title), R.drawable.bund));
        mAttractions.add(new Attraction(getString(R.string.museum_title), R.drawable.museum));
        mAttractions.add(new Attraction(getString(R.string.zoo_title), R.drawable.zoo));
        mAttractions.add(new Attraction(getString(R.string.yu_garden_title), R.drawable.yu_garden));
        mAttractions.add(new Attraction(getString(R.string.train_title), R.drawable.train));
    }

    // I know this is nasty but I don't know how to use CardView with ListView
    private void goToAttraction(String attractionName) {
        Intent attractionIntent = new Intent(ExploreActivity.this, ExploreActivity.class);
        if (attractionName == getString(R.string.bund_title)) {
            attractionIntent = new Intent(ExploreActivity.this, BundActivity.class);
        } else if (attractionName == getString(R.string.museum_title)) {
            attractionIntent = new Intent(ExploreActivity.this, MuseumActivity.class);
        } else if (attractionName == getString(R.string.zoo_title)) {
            attractionIntent = new Intent(ExploreActivity.this, ZooActivity.class);
        } else if (attractionName == getString(R.string.yu_garden_title)) {
            attractionIntent = new Intent(ExploreActivity.this, YuGardenActivity.class);
        } else if (attractionName == getString(R.string.train_title)) {
            attractionIntent = new Intent(ExploreActivity.this, TrainActivity.class);
        }
        startActivity(attractionIntent);
    }
}

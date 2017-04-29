package com.example.android.exploreshanghai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    private ArrayList<Favorite> mFavorites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list);

        initializeFavorites();

        // Create an {@link FavoriteAdapter}, whose data source is a list of {@link Favorite}s. The
        // adapter knows how to create list items for each item in the list.
        FavoriteAdapter favoriteAdapter = new FavoriteAdapter(this, mFavorites);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list
        ListView listView = (ListView) findViewById(R.id.favorite_list_view);

        // Make the {@link ListView} use the {@link FavoriteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Favorite} in the list.
        listView.setAdapter(favoriteAdapter);

        // Navigate Back to Main Activity
        Button homeButton = (Button) findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Create a new intent to open {@link MainActivity} */
                Intent homeIntent = new Intent(FavoriteActivity.this, MainActivity.class);

                startActivity(homeIntent);
            }
        });
    }

    private void initializeFavorites() {
        mFavorites = new ArrayList<>();
        mFavorites.add(new Favorite(R.drawable.fav_yu_garden));
        mFavorites.add(new Favorite(R.drawable.fav_bund));
        mFavorites.add(new Favorite(R.drawable.fav_zoo));
    }
}

package com.example.android.exploreshanghai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

    private ArrayList<Category> mCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        initializeCategories();

        // Create an {@link FavoriteAdapter}, whose data source is a list of {@link Favorite}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, mCategories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list
        ListView listView = (ListView) findViewById(R.id.category_list_view);

        // Make the {@link ListView} use the {@link FavoriteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Favorite} in the list.
        listView.setAdapter(categoryAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Category category = mCategories.get(position);
                startActivity(new Intent(ExploreActivity.this, category.getCategoryActivity()));
            }
        });
    }

    private void initializeCategories() {
        // TODO FIX THIS WITH REAL DATA
        mCategories = new ArrayList<>();
        mCategories.add(new Category(getString(R.string.category_attractions), R.drawable.bund,
                AttractionActivity.class));
        mCategories.add(new Category(getString(R.string.category_food), R.drawable.museum,
                AttractionActivity.class));
        mCategories.add(new Category(getString(R.string.category_play), R.drawable.zoo,
                AttractionActivity.class));
    }
}

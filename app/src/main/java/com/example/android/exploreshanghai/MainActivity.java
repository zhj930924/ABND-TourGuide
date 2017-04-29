package com.example.android.exploreshanghai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the explore button by its id
        Button exploreButton = (Button) findViewById(R.id.button_explore);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Create a new intent to open {@link ExploreActivity} */
                Intent exploreIntent = new Intent(MainActivity.this, ExploreActivity.class);

                startActivity(exploreIntent);
            }
        });
    }
}

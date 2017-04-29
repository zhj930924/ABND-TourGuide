package com.example.android.exploreshanghai;

/**
 * Created by Jing Zhang on 4/28/2017.
 */

public class Attraction {

    private String mName;
    private int mImageResourceId;

    /**
     * Create a new attraction by specifying its name
     *
     * @param name Name of the attraction as String
     */
    public Attraction(String name) {
        mName = name;
    }

    /**
     * Create a new attraction by specifying its name and image
     *
     * @param name            Name of the attraction as String
     * @param imageResourceId Image of the attraction as int resource ID
     */
    public Attraction(String name, int imageResourceId) {
        this(name);
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    /**
     * @return the string representation of the {@link Attraction} object
     */
    @Override
    public String toString() {
        return "Attraction: " + mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

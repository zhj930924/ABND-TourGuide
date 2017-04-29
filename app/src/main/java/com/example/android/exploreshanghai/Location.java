package com.example.android.exploreshanghai;

/**
 * Created by Jing Zhang on 4/28/2017.
 */

public class Location {

    private String mName;
    private int mImageResourceId;

    /**
     * Create a new attraction by specifying its name
     *
     * @param name Name of the attraction as String
     */
    public Location(String name) {
        mName = name;
    }

    /**
     * Create a new attraction by specifying its name
     *
     * @param imageResourceId Image of the attraction as int resource ID
     */
    public Location(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new attraction by specifying its name and image
     *
     * @param name            Name of the attraction as String
     * @param imageResourceId Image of the attraction as int resource ID
     */
    public Location(String name, int imageResourceId) {
        this(name);
        mImageResourceId = imageResourceId;
    }

    // Getters
    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return the string representation of the {@link Location} object
     */
    @Override
    public String toString() {
        return String.format("Location: %s", mName);
    }
}

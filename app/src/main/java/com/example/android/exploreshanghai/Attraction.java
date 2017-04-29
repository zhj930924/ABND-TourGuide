package com.example.android.exploreshanghai;

/**
 * Created by Jing Zhang on 4/29/2017.
 */

public class Attraction extends Location {
    public Attraction(String name, int imageResourceId) {
        super(name, imageResourceId);
    }

    @Override
    public String toString() {
        return String.format("Attraction: %s", this.getName());
    }
}

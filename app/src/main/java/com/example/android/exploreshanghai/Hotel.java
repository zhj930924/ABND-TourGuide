package com.example.android.exploreshanghai;

public class Hotel extends Location {

    private int mRatingImageResourceId;
    private String mAddress;

    /**
     * @param name                  name as string
     * @param imageResourceId       food image's resource Id
     * @param ratingImageResourceId rating image's resource Id
     * @param address               address as string (This can be optional)
     */
    public Hotel(String name, int imageResourceId, int ratingImageResourceId, String address) {
        super(name, imageResourceId);
        mRatingImageResourceId = ratingImageResourceId;
        mAddress = address;
    }

    @Override
    public String toString() {
        return String.format("Hotel: %s", this.getName());
    }

    // Getters
    public int getRatingImageResourceId() {
        return mRatingImageResourceId;
    }

    public String getAddress() {
        return mAddress;
    }
}

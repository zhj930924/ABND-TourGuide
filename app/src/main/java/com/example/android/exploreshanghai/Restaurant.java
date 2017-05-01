package com.example.android.exploreshanghai;

public class Restaurant extends Location {

    private int mRatingImageResourceId;
    private String mAddress;
    private boolean mHasAddress = false;

    /**
     * @param name                  name as string
     * @param imageResourceId       food image's resource Id
     * @param ratingImageResourceId rating image's resource Id
     */
    public Restaurant(String name, int imageResourceId, int ratingImageResourceId) {
        super(name, imageResourceId);
        mRatingImageResourceId = ratingImageResourceId;
    }

    /**
     * @param name                  name as string
     * @param imageResourceId       food image's resource Id
     * @param ratingImageResourceId rating image's resource Id
     * @param address               address as string (This can be optional)
     */
    public Restaurant(String name, int imageResourceId, int ratingImageResourceId, String address) {
        this(name, imageResourceId, ratingImageResourceId);
        mAddress = address;
        mHasAddress = true;
    }

    @Override
    public String toString() {
        return String.format("Restaurant: %s", this.getName());
    }

    // Getters
    public int getRatingImageResourceId() {
        return mRatingImageResourceId;
    }

    public String getAddress() {
        return mAddress;
    }

    public boolean hasAddress() {
        return mHasAddress;
    }
}

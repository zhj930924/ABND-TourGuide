package com.example.android.exploreshanghai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Jing Zhang on 4/29/2017.
 */

public class Detail {
    //TODO This class may be useless

    private static ArrayList<String> mInfoViews = new ArrayList<>(Arrays.asList(
            "image", "title", "subtitle", "length", "fee", "address"));

    private static ArrayList<String> mReviewViews = new ArrayList<>(Arrays.asList(
            "map", "title", "subtitle", "ratings", "image_3_1", "image_3_2",
            "image_3_3", "review", "reviewer"));

    private HashMap<String, Integer> mResourceMap;
    private HashMap<String, Integer> mViewMap;

    // mType is 1 for "review" and 2 for "info"
    private int mType;

    /**
     * @param resourceMap A HashMap that has the same set of keys as mViewMap
     * @param type        String, can be either "review" or "info"
     */
    public Detail(HashMap<String, Integer> resourceMap, String type) {

        mResourceMap = resourceMap;

        if (type == "review") {
            mType = 1;
            mViewMap.put("map", R.id.review_map);
            mViewMap.put("title", R.id.review_title);
            mViewMap.put("subtitle", R.id.review_subtitle);
            mViewMap.put("ratings", R.id.review_ratings);
            mViewMap.put("image_3_1", R.id.review_image_3_1);
            mViewMap.put("image_3_2", R.id.review_image_3_2);
            mViewMap.put("image_3_3", R.id.review_image_3_3);
            mViewMap.put("review", R.id.review_review);
            mViewMap.put("reviewer", R.id.review_reviewer);
        } else if (type == "info") {
            mType = 2;
            mViewMap.put("image", R.id.info_image);
            mViewMap.put("title", R.id.info_title);
            mViewMap.put("subtitle", R.id.info_subtitle);
            mViewMap.put("length", R.id.info_length);
            mViewMap.put("fee", R.id.info_fee);
            mViewMap.put("address", R.id.info_address);
        }
    }

    public int getViewId(String key) {
        return mViewMap.get(key);
    }

    public int getResourceId(String key) {
        return mResourceMap.get(key);
    }

    public boolean isImageView(String key) {
        boolean result = false;
        switch (mType) {
            // type is review
            case 1:
                result = (key == "image");
            // type is info
            case 2:
                result = (key == "map" || key == "ratings") ||
                        (key == "image_3_1" || key == "image_3_2" || key == "image_3_3");
        }
        return result;
    }

    public ArrayList<String> getKeys() {
        return mType == 1 ? mReviewViews : mInfoViews;
    }
}

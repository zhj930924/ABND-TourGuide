package com.example.android.exploreshanghai;

public class Category extends Location {
    private Class mCategoryActivity;

    public Category(String name, int imageResourceId, Class<?> categoryActivity) {
        super(name, imageResourceId);
        mCategoryActivity = categoryActivity;
    }

    @Override
    public String toString() {
        return String.format("Category: %s", this.getName());
    }


    public Class getCategoryActivity() {
        return mCategoryActivity;
    }
}

package com.example.android.exploreshanghai;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jing Zhang on 4/29/2017.
 */

public class DetailAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link DetailAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public DetailAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if (mContext instanceof BundActivity) {
            switch (position) {
                case 0: fragment = new BundReviewFragment(); break;
                case 1: fragment = new BundInfoFragment(); break;
            }
        } else if (mContext instanceof MuseumActivity) {
            switch (position) {
                case 0: fragment = new MuseumReviewFragment(); break;
                case 1: fragment = new MuseumInfoFragment(); break;
            }
        }else if (mContext instanceof ZooActivity) {
            switch (position) {
                case 0: fragment = new ZooReviewFragment(); break;
                case 1: fragment = new ZooInfoFragment(); break;
            }
        }else if (mContext instanceof YuGardenActivity) {
            switch (position) {
                case 0: fragment = new YuGardenReviewFragment(); break;
                case 1: fragment = new YuGardenInfoFragment(); break;
            }
        }else if (mContext instanceof TrainActivity) {
            switch (position) {
                case 0: fragment = new TrainReviewFragment(); break;
                case 1: fragment = new TrainInfoFragment(); break;
            }
        }
        return fragment;
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title = null;
        switch (position) {
            case 0: title = mContext.getString(R.string.review); break;
            case 1: title = mContext.getString(R.string.info); break;
        }
        return title;
    }
}

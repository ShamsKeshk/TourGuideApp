package com.udicity.shams.tourinsuez.hotel;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantMainFragment;

/**
 * Created by shams on 26/06/17.
 * <p>
 * I Add Hotel Fragment To View Pager , Cause I Will Add Another Two Fragments ..
 * Example : The First Fragment For Top Hotel
 * The Second Will Be For Local Hotels.
 * And THe Third Will Be For people That Provide Their Houses for Sleep against few Money..
 */

public class HotelFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public HotelFragmentAdapter(FragmentManager fm, Context contextP) {
        super(fm);
        context = contextP;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new RestaurantMainFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.hotel_category);
        } else return context.getString(R.string.no_title_found);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
package com.udicity.shams.tourinsuez.AboutSuez;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.udicity.shams.tourinsuez.R;

import java.util.ArrayList;

/**
 * Created by shams on 27/06/17.
 */

public class AboutSuezCategoryAdapter extends ArrayAdapter<AboutSuezCategory> {

    public AboutSuezCategoryAdapter(Activity activity, ArrayList<AboutSuezCategory> aboutSuezCategoryArrayList) {
        super(activity, 0, aboutSuezCategoryArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        AboutSuezViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.about_suez_list_items, parent, false);

            viewHolder = new AboutSuezViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (AboutSuezViewHolder) convertView.getTag();
        }
        AboutSuezCategory currentItem = getItem(position);

        assert currentItem != null;
        viewHolder.getmTopicHeader().setText(currentItem.getmTopicHeader());

        if (currentItem.hasTextOne()) {
            viewHolder.getmTopicOneExplain().setText(currentItem.getmTopicExplainPartOne());
            viewHolder.getmTopicOneExplain().setVisibility(View.VISIBLE);
        } else {
            viewHolder.getmTopicOneExplain().setVisibility(View.GONE);
        }

        if (currentItem.hasImageOne()) {
            viewHolder.getmTopicOneImage().setImageResource(currentItem.getmTopicImageResourcePartOne());
            viewHolder.getmTopicOneImage().setVisibility(View.VISIBLE);
        } else {
            viewHolder.getmTopicOneImage().setVisibility(View.GONE);
        }

        if (currentItem.hasTextTwo()) {
            viewHolder.getmTopicTwoExplain().setText(currentItem.getmTopicExplainPartTwo());
            viewHolder.getmTopicTwoExplain().setVisibility(View.VISIBLE);
        } else {
            viewHolder.getmTopicTwoExplain().setVisibility(View.GONE);
        }

        if (currentItem.hasImageTwo()) {
            viewHolder.getmTopicTwoImage().setImageResource(currentItem.getmTopicImageResourcePartTwo());
            viewHolder.getmTopicTwoImage().setVisibility(View.VISIBLE);
        } else {
            viewHolder.getmTopicTwoImage().setVisibility(View.GONE);
        }

        return convertView;
    }
}
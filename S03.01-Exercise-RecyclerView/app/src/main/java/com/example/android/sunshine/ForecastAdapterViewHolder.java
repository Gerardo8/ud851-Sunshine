package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by gerardo8 on 09/12/2017.
 */

public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

    public final TextView mWeatherTextView;

    public ForecastAdapterViewHolder(View itemView) {
        super(itemView);
        mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
    }
}

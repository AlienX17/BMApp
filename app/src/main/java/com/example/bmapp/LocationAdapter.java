package com.example.bmapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<LocationDetails> {

    LocationAdapter(Activity context, ArrayList<LocationDetails> locationDetails) {
        super(context, 0, locationDetails);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocationDetails currentLocationDetails = getItem(position);


        TextView nameTextView = listItemView.findViewById(R.id.location_name);
        assert currentLocationDetails != null;
        nameTextView.setText(currentLocationDetails.getLocationName());


        TextView addressTextView = listItemView.findViewById(R.id.location_address);
        addressTextView.setText(currentLocationDetails.getLocationAddress());


        TextView ratingTextView = listItemView.findViewById(R.id.location_rating);
        ratingTextView.setText(currentLocationDetails.getLocationRating());


        ImageView locationImageView = listItemView.findViewById(R.id.location_image);
        locationImageView.setImageResource(currentLocationDetails.getImageId());

        return listItemView;
    }
}

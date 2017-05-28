package com.nevena.absudacity.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the currentLocation object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentLocation.getPhotoId() != Location.DETAIL_NOT_AVAILABLE) {
            // set the image to the image resource specified in the current Word
            imageView.setImageResource(currentLocation.getPhotoId());

            // Make sure that view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID title
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        if (currentLocation.getTitleId() != Location.DETAIL_NOT_AVAILABLE) {
            // set this text on the name TextView
            title.setText(currentLocation.getTitleId());

            // Make sure that view is visible
            title.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the title
            title.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID description
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        if (currentLocation.getDescriptionId() != Location.DETAIL_NOT_AVAILABLE) {
            // set this text on the name TextView
            description.setText(currentLocation.getDescriptionId());

            // Make sure that view is visible
            description.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the description
            description.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID address
        TextView address = (TextView) listItemView.findViewById(R.id.address);

        if (currentLocation.getAddressId() != Location.DETAIL_NOT_AVAILABLE) {
            // set this text on the name TextView
            address.setText(currentLocation.getAddressId());

            // Make sure that view is visible
            address.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the address
            address.setVisibility(View.GONE);
        }

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}

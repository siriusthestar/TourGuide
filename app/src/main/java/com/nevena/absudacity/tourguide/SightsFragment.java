package com.nevena.absudacity.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of card items
        final ArrayList<Location> locationList = new ArrayList<Location>();
        locationList.add(new Location(R.drawable.zagreb_gornji_grad, R.string.sights_about_zagreb, R.string.sights_zagreb_info, Location.DETAIL_NOT_AVAILABLE));
        locationList.add(new Location(R.drawable.katedrala, R.string.sights_cathedral, R.string.sights_cathedral_details, Location.DETAIL_NOT_AVAILABLE));
        locationList.add(new Location(R.drawable.dolac_market, R.string.sights_dolac, R.string.sights_dolac_details, Location.DETAIL_NOT_AVAILABLE));

        // Create an adapter whose data source is a list of locations
        LocationAdapter adapter =
                new LocationAdapter(getActivity(), locationList);

        // Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Adapter will display list items for each item in the list
        listView.setAdapter(adapter);

        return rootView;
    }
}

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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of card items
        final ArrayList<Location> locationList = new ArrayList<Location>();
        locationList.add(new Location(R.drawable.mimara, R.string.museums_mimara, R.string.museums_mimara_details, Location.DETAIL_NOT_AVAILABLE));
        locationList.add(new Location(R.drawable.muo, R.string.museums_muo, R.string.museums_muo_details, Location.DETAIL_NOT_AVAILABLE));
        locationList.add(new Location(R.drawable.broken, R.string.museums_broken, R.string.museums_broken_details, Location.DETAIL_NOT_AVAILABLE));

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

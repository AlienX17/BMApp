package com.example.bmapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
    }

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<LocationDetails> locations = new ArrayList<>();

        locations.add(new LocationDetails("Museum of Mineralogy", "Bulevardul Traian 8", "★★★★★", R.drawable.mineralogy));
        locations.add(new LocationDetails("Museum of Ethnography", "Str Dealul Florilor 1", "★★★★★", R.drawable.ethnography));
        locations.add(new LocationDetails("Museum of History", "Str Monetăriei 1-3", "★★★★★", R.drawable.history));
        locations.add(new LocationDetails("Butcher's Bastion", "Piaţa Izvoarelor 2", "★★★★☆", R.drawable.bastion));
        locations.add(new LocationDetails("Stephen's Tower", "Piața Cetății", "★★★★★", R.drawable.tower));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
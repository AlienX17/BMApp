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
public class ParksFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
    }

    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<LocationDetails> locations = new ArrayList<>();

        locations.add(new LocationDetails("Park 'Queen Mary'", "Str Valea Roșie 6", "★★★★★", R.drawable.queen));
        locations.add(new LocationDetails("Central Park", "Str Serelor", "★★★★★", R.drawable.central));
        locations.add(new LocationDetails("Mara Park", "Bulevardul Unirii", "★★★★☆", R.drawable.mara));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

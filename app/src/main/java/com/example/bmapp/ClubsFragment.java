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
public class ClubsFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
    }

    public ClubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<LocationDetails> locations = new ArrayList<>();

        locations.add(new LocationDetails("Club Athos", "Bulevardul Independenței 2", "★★★☆☆", R.drawable.athos));
        locations.add(new LocationDetails("La Moustache", "Piața Libertății 5", "★★★★★", R.drawable.moustache));
        locations.add(new LocationDetails("Mystique Pub", "Str. Școlii 1", "★★★★☆", R.drawable.mystique));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
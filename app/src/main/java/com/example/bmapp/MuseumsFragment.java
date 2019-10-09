package com.example.bmapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        final View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<LocationDetails> locations = new ArrayList<>();

        // todo: The images don't match the place. If you don't want to show an image, you should
        //  remove drawable.
        locations.add(new LocationDetails("Museum of Mineralogy", "Bulevardul Traian 8", "★★★★★", R.drawable.log_out));
        locations.add(new LocationDetails("Museum of Ethnography", "Str Dealul Florilor 1", "★★★★★", R.drawable.bonissimo));
        locations.add(new LocationDetails("Museum of History", "Str Monetăriei 1-3", "★★★★★", R.drawable.padrino));
        locations.add(new LocationDetails("Museum of Art Artistic", "Strada 1 Mai 8", "★★★★★", R.drawable.smart));
        locations.add(new LocationDetails("Butcher's Bastion", "Piaţa Izvoarelor 2", "★★★★☆", R.drawable.log_out));
        locations.add(new LocationDetails("Stephen's Tower", "Piața Cetății", "★★★★★", R.drawable.bonissimo));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.word_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
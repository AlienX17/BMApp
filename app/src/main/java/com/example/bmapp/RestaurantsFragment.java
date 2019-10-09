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
public class RestaurantsFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
    }

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<LocationDetails> locations = new ArrayList<>();

        locations.add(new LocationDetails("Log Out", "Piața Libertății 20", "★★★★☆", R.drawable.log_out));
        locations.add(new LocationDetails("Buonissimo", "Str. Școlii 3A", "★★★★★", R.drawable.bonissimo));
        locations.add(new LocationDetails("Il Padrino", "Str. Școlii 9", "★★★★★", R.drawable.padrino));
        locations.add(new LocationDetails("Smart Food", "Bulevardul Republicii 64A", "★★★★★", R.drawable.smart));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

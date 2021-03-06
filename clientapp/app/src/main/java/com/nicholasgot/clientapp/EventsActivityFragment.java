package com.nicholasgot.clientapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Fragment for Events Activity class
 */
public class EventsActivityFragment extends Fragment {

    public EventsActivityFragment() {
    }

    // TODO: Make this activity do something a lot more useful (List of events happening nearby
    // TODO: consider modularising desing by having a fragment to enable display of pref settings for travel

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        Spinner eventsSpinner = (Spinner) view.findViewById(R.id.events_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.events_happening, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eventsSpinner.setAdapter(adapter);

        return view;
    }
}

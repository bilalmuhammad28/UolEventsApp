package com.example.bilal.myapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

/**
 * Created by Bilal on 6/29/2017.
 */

public class Home extends Fragment  {

    SearchView searchView;


    private   ListView listView;
    private ArrayList<Event> events;
    private ListAdapter listEvents;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        events=new ArrayList<Event>();
        listEvents = new ListAdapter(this,events);
        listEvents=(ListView) findViewById(R.id.listEvents);

    }

}


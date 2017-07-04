package com.example.bilal.myapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bilal on 7/1/2017.
 */

public class Listadapter extends ArrayAdapter {

    private Context context;
    private ArrayList<Event> event;


    public Listadapter(Context context, ArrayList<Event> eventlist) {
        super(context, R.layout.eventlist,eventlist);
        this.context=context;
        this.event=eventlist;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View eventlist=inflater.inflate(R.layout.eventlist,null);
        Event e=event.get(position);

        ((TextView)eventlist.findViewById(R.id.name)).setText(e.name);
        ((TextView)eventlist.findViewById(R.id.venue)).setText(e.event_venue);
        ((TextView)eventlist.findViewById(R.id.date)).setText(e.event_date );
        ((TextView)eventlist.findViewById(R.id.des)).setText(e.descripition);
        ((TextView)eventlist.findViewById(R.id.pic)).setText(e.picture);

        return  eventlist;
    }
}

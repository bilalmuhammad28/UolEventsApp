package com.example.bilal.myapp;

/**
 * Created by Bilal on 6/30/2017.
 */

public class Event {

    public   String name;
    public String event_venue;
    public String event_date;
    public String descripition;
    public String picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getevent_venue() {
        return event_venue;
    }

    public void setevent_venue(String event_venue) {
        this.event_venue = event_venue;
    }

    public String getevent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        event_date = event_date;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

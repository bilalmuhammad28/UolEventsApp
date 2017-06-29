<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class eventController extends Controller
{
    public fuction index()
    {
    	$response=[];
    	$response['success']=1;
    	$response['events']=event::orderBy('name','desc')->get() ;
    	echo 'json($response)';
    	return response()->json($response);
    }

    public fuction show()
    {
    	 return response()->json($response);

    }
    public fuction store(Request $r)
    {
    	$response = [];
      $name = $r->input('name');
      $event_date = $r->input('event_date');
      $event_venue = $r->input('event_venue');
      $discription = $r->input('discription');
      $picture=$r->input('picture');
      $event = new event;
      $event->name = $name;
      $event->event_date = $event_date;
      $event->event_venue = $event_venue;
      $event->discription = $discription;
      $event->picture=$picture;
      $event->save();
      $response['success'] = 1;
      $response['message'] = 'event successfully created.';
      return response()->json($response);

    }
    public fuction edit(Request $r)
    {

    	$response = [];
      $response['success'] = 1;
      $name = $r->input('name');
      $response['event'] = event::find($name);
      return response()->json($response);
    }
    public fuction update(Request $r)
    {
    	 $response = [];
      $name = $r->input('name');
      $event_date = $r->input('event_date');
      $event_venue = $r->input('event_venue');
      $discription = $r->input('discription');
      $picture = $r->input('picture');
      $event = event::find($name);
      $event->name = $name;
      $event->event_date = $event_date;
      $event->event_venue = $event_venue;
      $event->discription = $discription;
      $event->picture=$picture;
      $event->save();
      $response['success'] = 1;
      $response['message'] = 'event successfully updated.';
      return response()->json($response);
    }
    public fuction destroy(Request $r)
    {
    	$response = [];
      $response['success'] = 1;
      $response['message'] = 'event successfully deleted.';
      $name = $r->input('name');
      $event = event::find($id);
      $event->delete();
      return response()->json($response);
    }


}

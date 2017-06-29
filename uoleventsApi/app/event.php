<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class event extends Model
{
     protected $table = 'event';
     
     public $primaryKey = 'name';

      protected $fillable = array('name','event_date','event_venue','description','picture');
}

<?php

Route::get('/','eventController@index');
Route::get('show','eventController@show');
Route::post('store','eventController@store');
Route::get('edit','eventController@edit');
Route::patch('update','eventController@update');
Route::delete('delete','eventController@delete');


?>
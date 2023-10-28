package com.lcwd.ServiceRegistry.services;

import java.util.List;

import com.lcwd.ServiceRegistry.entity.Hotel;

public interface HotelService {
	
	
	
	

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);

}

package com.lcwd.ServiceRegistry.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.lcwd.ServiceRegistry.entity.Hotel;
import com.lcwd.ServiceRegistry.repository.HotelRepository;

public class HotelServiceimpl implements HotelService
{

	
	@Autowired
    private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		
		String hotelId = UUID.randomUUID().toString();
	    hotel.setId(hotelId);  // Call setId on the instance of Hotel
	    return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
				 return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!"));
	}

}

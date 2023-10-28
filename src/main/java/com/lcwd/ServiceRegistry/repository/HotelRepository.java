package com.lcwd.ServiceRegistry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.ServiceRegistry.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}

package com.lcwd.hotel.services.impl;
import com.lcwd.hotel.entites.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();        // to generate random hotel id
        hotel.setId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id note found yaar....!!!"));
    }
}

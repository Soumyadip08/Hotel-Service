package com.lcwd.hotel.repositories;
import com.lcwd.hotel.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel , String> {

}

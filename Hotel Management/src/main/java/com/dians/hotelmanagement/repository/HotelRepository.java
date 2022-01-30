package com.dians.hotelmanagement.repository;

import com.dians.hotelmanagement.model.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Page<Hotel> findAllByCityName(String cityName, Pageable pageable);

    List<Hotel> findAllByCityName(String cityName);

    Hotel findHotelByCityNameAndName(String cityName, String hotelName);
}

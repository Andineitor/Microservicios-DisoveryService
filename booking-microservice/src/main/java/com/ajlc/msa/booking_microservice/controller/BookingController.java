package com.ajlc.msa.booking_microservice.controller;

import com.ajlc.msa.booking_microservice.entity.Booking;
import com.ajlc.msa.booking_microservice.repository.IBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private IBookingRepository repo;

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        return repo.save(booking);
    }

    @GetMapping("/view")
    public List<Booking> getBookings() {
        return  repo.findAll();
    }
}

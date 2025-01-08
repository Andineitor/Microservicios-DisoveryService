package com.ajlc.msa.booking_microservice.repository;

import com.ajlc.msa.booking_microservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookingRepository extends JpaRepository<Booking, Integer> {
}

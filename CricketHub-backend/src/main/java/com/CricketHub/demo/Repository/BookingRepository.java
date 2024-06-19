package com.CricketHub.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CricketHub.demo.Model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByFixtureId(Long id);
}

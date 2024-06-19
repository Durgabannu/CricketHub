package com.CricketHub.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CricketHub.demo.Model.Booking;
import com.CricketHub.demo.Model.Fixtures;
import com.CricketHub.demo.Repository.BookingRepository;
import com.CricketHub.demo.Repository.FixturesRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private FixturesRepository fixturesRepository;

    public String bookTicket(Long fixtureId, Booking booking) {
        Fixtures fixture = fixturesRepository.findById(fixtureId).orElse(null);
        if (fixture != null) {
            booking.setFixture(fixture);
            bookingRepository.save(booking);
            return "Booking successful";
        } else {
            return "Fixture with id " + fixtureId + " not found";
        }
    }

    public List<Booking> getBookingsForFixture(Long fixtureId) {
        return bookingRepository.findByFixtureId(fixtureId);
    }
}

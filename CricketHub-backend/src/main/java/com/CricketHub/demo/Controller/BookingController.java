package com.CricketHub.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.CricketHub.demo.Model.Booking;
import com.CricketHub.demo.Service.BookingService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookTicket/{fixtureId}")
    public ResponseEntity<String> bookTicket(@PathVariable Long fixtureId, @RequestBody Booking booking) {
        String result = bookingService.bookTicket(fixtureId, booking);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/getBookingsForFixture/{fixtureId}")
    public ResponseEntity<?> getBookingsForFixture(@PathVariable Long fixtureId) {
        return ResponseEntity.ok(bookingService.getBookingsForFixture(fixtureId));
    }
}

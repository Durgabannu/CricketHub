package com.CricketHub.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
    
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String seats;
    private String phnnumber;
    @ManyToOne
    @JoinColumn(name = "fixture_id")
    private Fixtures fixture;
    
    public Booking() {
    }

    public Booking(Long id, String name, String email, String seats, String phnnumber, Fixtures fixture) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.seats = seats;
        this.phnnumber = phnnumber;
        this.fixture = fixture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getPhnnumber() {
        return phnnumber;
    }

    public void setPhnnumber(String phnnumber) {
        this.phnnumber = phnnumber;
    }

    public Fixtures getFixture() {
        return fixture;
    }

    public void setFixture(Fixtures fixture) {
        this.fixture = fixture;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", name=" + name + ", email=" + email + ", seats=" + seats + ", phnnumber="
                + phnnumber + ", fixture=" + fixture + "]";
    }
    
}

// package com.CricketHub.demo.Service;

// import org.springframework.stereotype.Service;

// @Service
// public class FixturesService {
    
// }
// FixturesService.java
package com.CricketHub.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CricketHub.demo.Model.Fixtures;
import com.CricketHub.demo.Repository.FixturesRepository;

@Service
public class FixturesService {

    @Autowired
    private FixturesRepository fixturesRepository;

    public Fixtures addFixture(Fixtures fixture) {
        return fixturesRepository.save(fixture);
    }

    public List<Fixtures> viewFixtures() {
        return fixturesRepository.findAll();
    }

    public Fixtures getFixtureById(Long id) {
        return fixturesRepository.findById(id).orElse(null);
    }

    public Fixtures updateFixture(Long id, Fixtures updatedFixture) {
        Fixtures existingFixture = fixturesRepository.findById(id).orElse(null);
        if (existingFixture != null) {
            existingFixture.setTeam_x(updatedFixture.getTeam_x());
            existingFixture.setTeam_y(updatedFixture.getTeam_y());
            existingFixture.setDate(updatedFixture.getDate());
            existingFixture.setDay(updatedFixture.getDay());
            existingFixture.setVenue(updatedFixture.getVenue());
            existingFixture.setTime(updatedFixture.getTime());
            return fixturesRepository.save(existingFixture);
        }
        return null;
    }

    public String deleteFixture(Long id) {
        fixturesRepository.deleteById(id);
        return "Fixture with id " + id + " deleted successfully";
    }
}

// FixturesController.java
package com.CricketHub.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CricketHub.demo.Model.Fixtures;
import com.CricketHub.demo.Service.FixturesService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@RequestMapping("/fixtures")
public class FixturesController {

    @Autowired
    private FixturesService fixturesService;

    @PostMapping("/addFixture")
    public Fixtures addFixture(@RequestBody Fixtures fixture) {
        return fixturesService.addFixture(fixture);
    }

    @GetMapping("/viewFixtures")
    public List<Fixtures> viewFixtures() {
        return fixturesService.viewFixtures();
    }

    @GetMapping("/viewFixture/{id}")
    public ResponseEntity<Fixtures> viewFixtureById(@PathVariable Long id) {
        Fixtures fixture = fixturesService.getFixtureById(id);
        if (fixture != null) {
            return new ResponseEntity<>(fixture, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateFixture/{id}")
    public Fixtures updateFixture(@PathVariable Long id, @RequestBody Fixtures updatedFixture) {
        return fixturesService.updateFixture(id, updatedFixture);
    }

    @DeleteMapping("/deleteFixture/{id}")
    public String deleteFixture(@PathVariable Long id) {
        return fixturesService.deleteFixture(id);
    }
}

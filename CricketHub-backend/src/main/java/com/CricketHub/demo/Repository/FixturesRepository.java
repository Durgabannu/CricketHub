package com.CricketHub.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CricketHub.demo.Model.Fixtures;

public interface FixturesRepository extends JpaRepository<Fixtures, Long> {
    
}

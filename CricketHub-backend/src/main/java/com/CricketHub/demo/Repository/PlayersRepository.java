package com.CricketHub.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CricketHub.demo.Model.Players;

public interface PlayersRepository extends JpaRepository<Players, Long>{
    
}

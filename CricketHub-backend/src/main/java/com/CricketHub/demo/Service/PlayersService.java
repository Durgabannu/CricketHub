package com.CricketHub.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CricketHub.demo.Model.Players;
import com.CricketHub.demo.Repository.PlayersRepository;

@Service
public class PlayersService {
    @Autowired
    private PlayersRepository playersRepository;

    public Players addPlayer(Players player){
        return playersRepository.save(player);
    }


    public List<Players> viewPlayers(){
        return playersRepository.findAll();
    }


    public Players viewPlayerById(Long id) {
        return playersRepository.findById(id)
                .orElse(null);
    }

    public Players updatePlayer(Long id, Players updatedPlayer) {
        Players existingPlayer = playersRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Player with id " + id + " not found"));

        existingPlayer.setPlayerName(updatedPlayer.getPlayerName());
        existingPlayer.setDesignation(updatedPlayer.getDesignation());
        existingPlayer.setCountry(updatedPlayer.getCountry());
        existingPlayer.setAge(updatedPlayer.getAge());
        existingPlayer.setRuns(updatedPlayer.getRuns());
        existingPlayer.setWickets(updatedPlayer.getWickets());

        return playersRepository.save(existingPlayer);
    }

    public String deletePlayer(Long id) {
        playersRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Player with id " + id + " not found"));

        playersRepository.deleteById(id);
        return "Player with id " + id + " deleted successfully";
    }
}

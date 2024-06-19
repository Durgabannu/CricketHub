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
import org.springframework.web.bind.annotation.RestController;

import com.CricketHub.demo.Model.Players;
import com.CricketHub.demo.Service.PlayersService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class PlayersController {
    @Autowired
    private PlayersService playersService;

    @PostMapping("/addplayer")
    public Players addPlayer(@RequestBody Players player){
        return playersService.addPlayer(player);
    }

    @GetMapping("/viewPlayers")
    public List<Players> viewPlayers(){
        return playersService.viewPlayers();
    }

    @GetMapping("/viewplayer/{id}")
    public ResponseEntity<Players> viewPlayerById(@PathVariable Long id) {
        Players player = playersService.viewPlayerById(id);
        if (player != null) {
            return new ResponseEntity<>(player, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateplayer/{id}")
    public Players updatePlayer(@PathVariable Long id, @RequestBody Players updatedPlayer) {
        return playersService.updatePlayer(id, updatedPlayer);
    }

    @DeleteMapping("/deleteplayer/{id}")
    public String deletePlayer(@PathVariable Long id) {
        return playersService.deletePlayer(id);
    }
}

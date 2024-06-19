package com.CricketHub.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PlayersProfiles")
public class Players {
    
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "playerName")
    private String playerName;

    @Column(name = "designation")
    private String designation;

    @Column(name = "country")
    private String country;

    @Column(name = "age")
    private String age;

    @Column(name = "runs")
    private String runs;

    @Column(name = "wickets")
    private String wickets;

    

    public Players() {
    }

    

    public Players(long id, String playerName, String designation, String country, String age, String runs,
            String wickets) {
        this.id = id;
        this.playerName = playerName;
        this.designation = designation;
        this.country = country;
        this.age = age;
        this.runs = runs;
        this.wickets = wickets;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }



    @Override
    public String toString() {
        return "Players [id=" + id + ", playerName=" + playerName + ", designation=" + designation + ", country="
                + country + ", age=" + age + ", runs=" + runs + ", wickets=" + wickets + "]";
    }

    
}

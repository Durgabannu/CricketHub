package com.CricketHub.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fixtures")
public class Fixtures {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "team_x")
    private String team_x;

    @Column(name = "team_y")
    private String team_y;

    @Column(name = "date")
    private String date;

    @Column(name = "day")
    private String day;

    @Column(name = "venue")
    private String venue;

    @Column(name = "time")
    private String time;

    public Fixtures() {
    }

    public Fixtures(long id, String team_x, String team_y, String date, String day, String venue, String time) {
        this.id = id;
        this.team_x = team_x;
        this.team_y = team_y;
        this.date = date;
        this.day = day;
        this.venue = venue;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeam_x() {
        return team_x;
    }

    public void setTeam_x(String team_x) {
        this.team_x = team_x;
    }

    public String getTeam_y() {
        return team_y;
    }

    public void setTeam_y(String team_y) {
        this.team_y = team_y;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Fuxtures [id=" + id + ", team_x=" + team_x + ", team_y=" + team_y + ", date=" + date + ", day=" + day
                + ", venue=" + venue + ", time=" + time + "]";
    }

    
}

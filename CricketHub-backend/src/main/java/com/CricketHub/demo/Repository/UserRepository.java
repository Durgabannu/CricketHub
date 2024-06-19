package com.CricketHub.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CricketHub.demo.Model.User;


public interface UserRepository extends JpaRepository<User , Long> {
    User findByName(String name);
}


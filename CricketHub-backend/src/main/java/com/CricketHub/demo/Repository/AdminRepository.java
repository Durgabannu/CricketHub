package com.CricketHub.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CricketHub.demo.Model.Admin;

public interface AdminRepository extends JpaRepository<Admin , Long> {
    Admin findByName(String name);
}

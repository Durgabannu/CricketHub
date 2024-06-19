package com.CricketHub.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CricketHub.demo.Model.Videos;


@Repository
public interface VideoRepository extends JpaRepository<Videos, Integer> {
	

}


package com.example.AlokWatchlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AlokWatchlist.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{

}

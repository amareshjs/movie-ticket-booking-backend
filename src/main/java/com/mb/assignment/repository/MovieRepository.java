package com.mb.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.assignment.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {

	Movie findMovieById(Long id);
}

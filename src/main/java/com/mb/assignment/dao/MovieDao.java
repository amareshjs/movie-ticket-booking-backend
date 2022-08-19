package com.mb.assignment.dao;

import java.util.List;
import java.util.Optional;

import com.mb.assignment.entity.Movie;

public interface MovieDao {
	
	public List<Movie> findAll();
	
	public Movie findById(Long id);
	
	public void deleteMovie(Movie movie);
	
	public Movie addMovie(Movie movie);
}

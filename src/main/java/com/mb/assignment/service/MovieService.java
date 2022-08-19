package com.mb.assignment.service;

import java.util.List;

import com.mb.assignment.dto.MovieDto;
import com.mb.assignment.entity.Movie;

public interface MovieService {
	
	public List<Movie> findAll();
	public Movie findById(Long id);
	public Movie addMovie(MovieDto movieDto);
	public Movie updateMovie(Long id,MovieDto movieDto);
	public void deleteMovie(Long id);

}

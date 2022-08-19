package com.mb.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mb.assignment.entity.Movie;
import com.mb.assignment.exception.CustomException;
import com.mb.assignment.exception.ErrorCode;
import com.mb.assignment.repository.MovieRepository;

@Repository
public class MovieDaoImpl implements MovieDao {
	
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}
	
	
	

	@Override
	public Movie findById(Long id) {
		
		Movie movie=movieRepository.findMovieById(id);
		if(movie!=null) {
			return movie;
		}
		else {
			throw new CustomException("Movie Not Found with ID"+id, ErrorCode.MOVIE_NOT_FOUND);
		}
		
	}
	
	@Override
	public Movie addMovie(Movie movie) {
		
		try {
			
			return movieRepository.save(movie);
		}catch(Exception e) {
			throw new CustomException("Error while saving Movie", ErrorCode.INTERNAL_SERVER_ERROR);
		}
		
		
	}

	@Override
	public void deleteMovie(Movie movie) {
		
		try {
			movieRepository.delete(movie);
		}catch(Exception e) {
			throw new CustomException("Error while deleting Movie", ErrorCode.INTERNAL_SERVER_ERROR);
		}
		
	}

}

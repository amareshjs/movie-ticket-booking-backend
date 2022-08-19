package com.mb.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.assignment.dao.MovieDao;
import com.mb.assignment.dto.MovieDto;
import com.mb.assignment.entity.Movie;
import com.mb.assignment.mapper.Mapper;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDao movieDao;

	@Autowired
	private Mapper mapper;
	
	
	
	/**	
 	* all Movie details  
 	* @returns list of employees
 	*/
	@Override
	public List<Movie> findAll() {
		
		return movieDao.findAll();
	}

	
	/**
	 * Movie details
	 * @param Movie Id of movie whose record want to get
	 * @return movie object 
	 */
	@Override
	public Movie findById(Long id) {
		
		return movieDao.findById(id);
	}
	
	/**
	 * Add new Movie
	 * @param MovieDto details of Movie
	 * @return movie object
	 */
	
	@Override
	public Movie addMovie(MovieDto movieDto) {
		
		Movie movie=mapper.convert(movieDto, Movie.class);
		return movieDao.addMovie(movie);
	}

	/**
	 * Update Movie Details
	 * @param Movie Id of movie whose record want to get
	 * @param MovieDto updated details of Movie
	 * @exception if movie not found for Movie Id
	 */

	@Override
	public Movie updateMovie(Long id, MovieDto movieDto) {
		
		Movie  oldMovie=movieDao.findById(id);
		
		Movie updatedMovie=mapper.convert(movieDto, Movie.class);
		updatedMovie.setId(oldMovie.getId());
		
		return  movieDao.addMovie(updatedMovie);
	}
	

	/**
	 * Delete Movie
	 * 
	 * @param Movie Id of Movie
	 * @exception CustomException If Movie not found for Movie id
	 * 
	 */
	@Override
	public void deleteMovie(Long id) {
		
		Movie movie=movieDao.findById(id);

		movieDao.deleteMovie(movie);
	}
	
	

}

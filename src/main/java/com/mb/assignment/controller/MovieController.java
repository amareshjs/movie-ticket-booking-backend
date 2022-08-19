package com.mb.assignment.controller;
import static com.mb.assignment.constants.UrlMapping.MOVIES;
import static com.mb.assignment.constants.UrlMapping.SINGLE_MOVIE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.assignment.dto.MovieDto;
import com.mb.assignment.entity.Movie;
import com.mb.assignment.service.MovieService;
import com.mb.assignment.util.ResponseMaker;
import com.mb.assignment.util.SuccessResponse;

@RestController
public class MovieController extends BaseController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ResponseMaker  responseMaker;
	
	
	@GetMapping(MOVIES)
	public ResponseEntity<SuccessResponse<List<Movie>>>  findAll(){
		List<Movie> movies=movieService.findAll();
		return responseMaker.successResponse(movies, HttpStatus.OK);
	}
	
	@PostMapping(MOVIES)
	public ResponseEntity<SuccessResponse<Movie>> addMovie(@RequestBody MovieDto movieDto) {
		Movie movie= movieService.addMovie(movieDto);
		return responseMaker.successResponse(movie, HttpStatus.CREATED);
	}
	
	@GetMapping(SINGLE_MOVIE)
	public ResponseEntity<SuccessResponse<Movie>> findById(@PathVariable Long id) {
		
		Movie  movie= movieService.findById(id);
		return responseMaker.successResponse(movie, HttpStatus.OK);
	}
	
	@PutMapping(SINGLE_MOVIE)
	public ResponseEntity<SuccessResponse<Movie>> updateMovie(@PathVariable Long id, @RequestBody MovieDto movieDto) {
		
		Movie movie= movieService.updateMovie(id,movieDto);
		
		return responseMaker.successResponse(movie, HttpStatus.CREATED);
	}
	
	@DeleteMapping(SINGLE_MOVIE)
	public ResponseEntity<SuccessResponse<String>> deleteMovie(@PathVariable Long id) {
		
		 movieService.deleteMovie(id);
		
		return responseMaker.successResponse("Movie Deleted Successfully", HttpStatus.OK);
	}
	
	
	
}

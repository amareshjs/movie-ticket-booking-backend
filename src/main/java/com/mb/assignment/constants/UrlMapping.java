package com.mb.assignment.constants;

public class UrlMapping {
	
	private UrlMapping()
	{
		throw new IllegalStateException("Constants class.can't instatiate");
	}

	public static final String BASE_URL = "/api/v1";

	public static final String MOVIES = "/movies";
	
	public static final String SINGLE_MOVIE="/movies/{id}";

	public static final String BOOKINGS = "/api/v1/bookings";
	
	public static final String SINGLE_MOVIE_BOOKINGS="/bookings/{id}";
	
	public static final String SEATS="/api/v1/seats/{id}";

}

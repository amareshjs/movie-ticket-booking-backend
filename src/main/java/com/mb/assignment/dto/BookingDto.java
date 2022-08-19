package com.mb.assignment.dto;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class BookingDto {

	@NotNull
	private String customerName;
	
	@NotNull
	private String email;
	
	@NotNull
	private Long movieId;
	
	@NotEmpty
	private String[] seats;

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public Long getMovieId() {
		return movieId;
	}

	public String[] getSeats() {
		return seats;
	}
	
	
	
}

package com.mb.assignment.controller;
import static com.mb.assignment.constants.UrlMapping.BOOKINGS;
import static com.mb.assignment.constants.UrlMapping.SEATS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.assignment.dto.BookingDto;
import com.mb.assignment.entity.Booking;
import com.mb.assignment.service.BookingService;
import com.mb.assignment.util.ResponseMaker;
import com.mb.assignment.util.SuccessResponse;

@RestController
@CrossOrigin("*")
public class BookingController{
	

	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ResponseMaker responseMaker;
	
	
	@PostMapping(BOOKINGS)
	public ResponseEntity<SuccessResponse<Booking>> BookTickets(@RequestBody BookingDto bookingDto) {
		
		Booking booking=bookingService.addBooking(bookingDto);
		return responseMaker.successResponse(booking, HttpStatus.OK);
	}
	
	
	
	@GetMapping(BOOKINGS)
	public ResponseEntity<SuccessResponse<List<Booking>>> getBookings() {
		 List<Booking> bookings=bookingService.getBookings();
		 
		return responseMaker.successResponse(bookings, HttpStatus.OK);
	}
	
	
	
	@GetMapping(SEATS)
	public ResponseEntity<SuccessResponse<List<Booking>>> getReservedSeats(@PathVariable Long id) {
		 List<Booking> bookings=bookingService.getReservedSeats(id);
		
		return responseMaker.successResponse(bookings, HttpStatus.OK);
	}
	


}

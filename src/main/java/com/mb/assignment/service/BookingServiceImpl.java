package com.mb.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.assignment.dao.BookingDao;
import com.mb.assignment.dao.MovieDao;
import com.mb.assignment.dto.BookingDto;
import com.mb.assignment.entity.Booking;
import com.mb.assignment.entity.Movie;

@Service
public class BookingServiceImpl implements BookingService {

	
	@Autowired
	private BookingDao bookingDao;
	
	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Booking addBooking(BookingDto bookingDto) {
		
		Movie movie=movieDao.findById(bookingDto.getMovieId());
		
		Booking booking=new Booking();
		booking.setCustomerName(bookingDto.getCustomerName());
		booking.setEmail(bookingDto.getEmail());
		booking.setSeats(bookingDto.getSeats());
		booking.setMovie(movie);
		return bookingDao.addBooking(booking);
	}
	
	
	@Override
	public List<Booking> getReservedSeats(Long id) {
		return  bookingDao.getReservedSeats(id);
	}
	
	
	@Override
	public List<Booking> getBookings() {
		return bookingDao.getBookings();
	}

}

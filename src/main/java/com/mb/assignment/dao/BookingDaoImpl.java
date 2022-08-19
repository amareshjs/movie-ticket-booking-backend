package com.mb.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mb.assignment.entity.Booking;
import com.mb.assignment.exception.CustomException;
import com.mb.assignment.exception.ErrorCode;
import com.mb.assignment.repository.BookingRepository;

@Repository
public class BookingDaoImpl implements BookingDao {
	
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public Booking addBooking(Booking booking) {
		try {
			
			return bookingRepository.save(booking);
		}
		catch(Exception e) {
			throw new CustomException("Error while Booking", ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	public List<Booking> getReservedSeats(Long id) {
		
		
		return  bookingRepository.findReservedSeats(id);
	}

	@Override
	public List<Booking> getBookings() {
		return bookingRepository.findAll();
	}

	
	

}

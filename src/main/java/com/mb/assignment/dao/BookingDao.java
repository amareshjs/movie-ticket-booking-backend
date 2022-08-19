package com.mb.assignment.dao;

import java.util.List;

import com.mb.assignment.entity.Booking;

public interface BookingDao {

	public Booking addBooking(Booking booking);
	
	public List<Booking> getReservedSeats(Long id);
	
	public List<Booking> getBookings();
}

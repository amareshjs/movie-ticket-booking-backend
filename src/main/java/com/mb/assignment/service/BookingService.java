package com.mb.assignment.service;

import java.util.List;

import com.mb.assignment.dto.BookingDto;
import com.mb.assignment.entity.Booking;

public interface BookingService {

	public Booking addBooking(BookingDto bookingDto);
	public List<Booking> getReservedSeats(Long id);
	public List<Booking> getBookings();
}

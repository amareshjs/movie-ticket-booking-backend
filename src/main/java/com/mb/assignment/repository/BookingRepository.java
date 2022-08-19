package com.mb.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mb.assignment.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {


	@Query(value="SELECT * FROM movie_ticket_booking.bookings where movie_id=(?1)",nativeQuery = true)
	List<Booking> findReservedSeats(Long id);
	
}

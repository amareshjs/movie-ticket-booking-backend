package com.mb.assignment.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="customer_name")
		private String customerName;
		
		@Column(name="email")
		private String email;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "movie_id", nullable = false, updatable = false)
		private Movie movie;
		
		@Column(name="seats")
		private String[] seats;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Movie getMovie() {
			return movie;
		}

		public void setMovie(Movie movie) {
			this.movie = movie;
		}

		public String[] getSeats() {
			return seats;
		}

		public void setSeats(String[] seats) {
			this.seats = seats;
		}

		public Booking(Long id, String customerName, String email, Movie movie, String[] seats) {
			super();
			this.id = id;
			this.customerName = customerName;
			this.email = email;
			this.movie = movie;
			this.seats = seats;
		}

		public Booking() {
			super();
			}
		
		
		

		
}

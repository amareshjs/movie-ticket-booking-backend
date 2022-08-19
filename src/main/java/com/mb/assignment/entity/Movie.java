package com.mb.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="discription")
	private String discription;
	
	@Column(name="image")
	private String image;
	
	@Column(name="director")
	private String director;
	
	@Column(name="starcast")
	private String starcast;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="gener")
	private String gener;
	
	@Column(name="type")
	private String type;
	
	@Column(name="time")
	private String time;
	
	@Column(name="price")
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStarcast() {
		return starcast;
	}

	public void setStarcast(String starcast) {
		this.starcast = starcast;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Movie(Long id, String name, String discription, String image, String director, String starcast,
			String duration, String gener, String type, String time, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.image = image;
		this.director = director;
		this.starcast = starcast;
		this.duration = duration;
		this.gener = gener;
		this.type = type;
		this.time = time;
		this.price = price;
	}

	public Movie() {
		super();
	}
	
	
}


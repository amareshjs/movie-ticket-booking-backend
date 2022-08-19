package com.mb.assignment.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MovieDto {
	
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String discription;
	
	@NotBlank
	private String image;
	
	@NotBlank
	private String director;
	
	@NotBlank
	private String starcast;
	
	@NotBlank
	private String duration;
	
	@NotBlank
	private String gener;
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String time;
	
	@NotNull
	private Double price;

	
	public String getName() {
		return name;
	}

	public String getDiscription() {
		return discription;
	}

	public String getImage() {
		return image;
	}

	public String getDirector() {
		return director;
	}

	public String getStarcast() {
		return starcast;
	}

	public String getDuration() {
		return duration;
	}

	public String getGener() {
		return gener;
	}

	public String getType() {
		return type;
	}

	public String getTime() {
		return time;
	}

	public Double getPrice() {
		return price;
	}
	
	


}

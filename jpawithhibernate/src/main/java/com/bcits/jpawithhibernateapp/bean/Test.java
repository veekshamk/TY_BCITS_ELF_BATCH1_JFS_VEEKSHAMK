package com.bcits.jpawithhibernateapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_info")
public class Test implements Serializable{
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String movieName;
	
	@Column(name="rating")
	private String movierating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovierating() {
		return movierating;
	}
	public void setMovierating(String movierating) {
		this.movierating = movierating;
	}
}

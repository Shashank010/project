package com.cg.entities;

import java.time.LocalDate;

public class FlightInformation {
	
	private int flightno;
	private String airline;
	private String dep_city;
	private String arr_city;
	private LocalDate dep_date;
	private LocalDate arr_date;
	private int FirstSeats;
	private double FirstSeatFare;
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDep_city() {
		return dep_city;
	}
	public void setDep_city(String dep_city) {
		this.dep_city = dep_city;
	}
	public String getArr_city() {
		return arr_city;
	}
	public void setArr_city(String arr_city) {
		this.arr_city = arr_city;
	}
	public LocalDate getDep_date() {
		return dep_date;
	}
	public void setDep_date(LocalDate dep_date) {
		this.dep_date = dep_date;
	}
	public LocalDate getArr_date() {
		return arr_date;
	}
	public void setArr_date(LocalDate arr_date) {
		this.arr_date = arr_date;
	}
	public int getFirstSeats() {
		return FirstSeats;
	}
	public void setFirstSeats(int firstSeats) {
		FirstSeats = firstSeats;
	}
	public double getFirstSeatFare() {
		return FirstSeatFare;
	}
	public void setFirstSeatFare(double firstSeatFare) {
		FirstSeatFare = firstSeatFare;
	}
	@Override
	public String toString() {
		return "FlightInformation [flightno=" + flightno + ", airline="
				+ airline + ", dep_city=" + dep_city + ", arr_city=" + arr_city
				+ ", dep_date=" + dep_date + ", arr_date=" + arr_date
				+ ", FirstSeats=" + FirstSeats + ", FirstSeatFare="
				+ FirstSeatFare + "]";
	}
	public FlightInformation(int flightno, String airline, String dep_city,
			String arr_city, LocalDate dep_date, LocalDate arr_date,
			int firstSeats, double firstSeatFare) {
		super();
		this.flightno = flightno;
		this.airline = airline;
		this.dep_city = dep_city;
		this.arr_city = arr_city;
		this.dep_date = dep_date;
		this.arr_date = arr_date;
		FirstSeats = firstSeats;
		FirstSeatFare = firstSeatFare;
	}
	
	public  FlightInformation(){
		
	}
	

}

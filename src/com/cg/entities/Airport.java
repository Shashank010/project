package com.cg.entities;

public class Airport {
	private String AirportName;
	private String Abbreviation;
	private String Location;

	public String getAirportName() {
		return AirportName;
	}

	public void setAirportName(String airportName) {
		AirportName = airportName;
	}

	public String getAbbreviation() {
		return Abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		Abbreviation = abbreviation;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "Airport [AirportName=" + AirportName + ", Abbreviation="
				+ Abbreviation + ", Location=" + Location + "]";
	}

	public Airport(String airportName, String abbreviation, String location) {
		super();
		AirportName = airportName;
		Abbreviation = abbreviation;
		Location = location;
	}

	public Airport() {

	}
}

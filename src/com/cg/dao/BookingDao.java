package com.cg.dao;


import com.cg.entities.BookingInformation;
import com.cg.exception.FlightException;

public interface BookingDao {
	
	
	
	int addBookingDetails(BookingInformation book) throws FlightException;

}

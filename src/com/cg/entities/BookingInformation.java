package com.cg.entities;

public class BookingInformation {
	
	private int Booking_id;
	private String cust_email;
	private int no_of_passengers;
	private String class_type;
	private int total_fare;
	private int seat_number;
	private int CreditCard_info;
	private String src_city;
	private String dest_city;
	
	
	public int getBooking_id() {
		return Booking_id;
	}
	public void setBooking_id(int booking_id) {
		Booking_id = booking_id;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public int getNo_of_passengers() {
		return no_of_passengers;
	}
	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	public int getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(int total_fare) {
		this.total_fare = total_fare;
	}
	public int getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}
	public int getCreditCard_info() {
		return CreditCard_info;
	}
	public void setCreditCard_info(int creditCard_info) {
		CreditCard_info = creditCard_info;
	}
	public String getSrc_city() {
		return src_city;
	}
	public void setSrc_city(String src_city) {
		this.src_city = src_city;
	}
	public String getDest_city() {
		return dest_city;
	}
	public void setDest_city(String dest_city) {
		this.dest_city = dest_city;
	}
	@Override
	public String toString() {
		return "BookingInformation [Booking_id=" + Booking_id + ", cust_email="
				+ cust_email + ", no_of_passengers=" + no_of_passengers
				+ ", class_type=" + class_type + ", total_fare=" + total_fare
				+ ", seat_number=" + seat_number + ", CreditCard_info="
				+ CreditCard_info + ", src_city=" + src_city + ", dest_city="
				+ dest_city + "]";
	}
	public BookingInformation(int booking_id, String cust_email,
			int no_of_passengers, String class_type, int total_fare,
			int seat_number, int creditCard_info, String src_city,
			String dest_city) {
		super();
		Booking_id = booking_id;
		this.cust_email = cust_email;
		this.no_of_passengers = no_of_passengers;
		this.class_type = class_type;
		this.total_fare = total_fare;
		this.seat_number = seat_number;
		CreditCard_info = creditCard_info;
		this.src_city = src_city;
		this.dest_city = dest_city;
	}
	
	public BookingInformation() {
		
	}
	

}

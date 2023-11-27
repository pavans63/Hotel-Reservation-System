package com.HotelReservationSystem;

public class Reservation {
	private String reservationId;
	private Guest guest;
	private String checkInDate;
	private String checkOutDate;
	
	public Reservation(String reservationId, Guest guest, String checkInDate, String checkOutDate) {
		
		this.reservationId = reservationId;
		this.guest = guest;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
	
	public String getReservationId() {
        return reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }
}

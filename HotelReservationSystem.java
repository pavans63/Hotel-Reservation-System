package com.HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
	
	private List<Guest> guests;
	private List<Reservation> reservations;
	
	public HotelReservationSystem() {
		guests = new ArrayList<>();
		reservations = new ArrayList<>();
	}
	
	 public void createReservation(String reservationId, Guest guest, String checkInDate, String checkOutDate) {
	        Reservation reservation = new Reservation(reservationId, guest, checkInDate, checkOutDate);
	        reservations.add(reservation);
	    }

	    public void updateReservationDates(String reservationId, String newCheckInDate, String newCheckOutDate) {
	        Reservation reservation = findReservationById(reservationId);
	        if (reservation != null) {
	            reservation = new Reservation(reservationId, reservation.getGuest(), newCheckInDate, newCheckOutDate);
	           
	            
	                  // Update the reservation in the list
	            int index = reservations.indexOf(findReservationById(reservationId));
	            reservations.set(index, reservation);
	        } else {
	            System.out.println("Reservation not found");
	        }
	    }

	    public void cancelReservation(String reservationId) {
	        Reservation reservation = findReservationById(reservationId);
	        if (reservation != null) {
	            reservations.remove(reservation);
	        } else {
	            System.out.println("Reservation not found");
	        }
	    }

	    public void listReservationsByGuest(Guest guest) {
	        System.out.println("Reservations for guest " + guest.getName() + ":");
	        for (Reservation reservation : reservations) {
	            if (reservation.getGuest().equals(guest)) {
	                System.out.println("Reservation ID: " + reservation.getReservationId() +
	                        ", Check-in Date: " + reservation.getCheckInDate() +
	                        ", Check-out Date: " + reservation.getCheckOutDate());
	            }
	        }
	    }

	    private Reservation findReservationById(String reservationId) {
	        for (Reservation reservation : reservations) {
	            if (reservation.getReservationId().equals(reservationId)) {
	                return reservation;
	            }
	        }
	        return null;
	    }
	}



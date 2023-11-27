package com.HotelReservationSystem;

public class Main {

	public static void main(String[] args) {
		
		HotelReservationSystem hotelSystem = new HotelReservationSystem();
		
		Guest guest1 = new Guest("301", "Amit");          //Creating guests
		Guest guest2 = new Guest("302", "Rachana");
		Guest guest3 = new Guest("303", "Sagar");
		Guest guest4 = new Guest("304", "Sakshi");
		Guest guest5 = new Guest("305", "Amita");
		Guest guest6 = new Guest("306", "Kiran");
		Guest guest7 = new Guest("307", "Shalaka");
		
		
		
		
		hotelSystem.createReservation("R1", guest1, "01-10-2023", "04-10-2023");    // Creating reservations
		hotelSystem.createReservation("R2", guest2, "21-12-2023", "26-12-2023");
		hotelSystem.createReservation("R3", guest3, "06-07-2023", "10-07-2023");
		hotelSystem.createReservation("R4", guest4, "21-02-2023", "23-02-2023");
		hotelSystem.createReservation("R5", guest5, "15-04-2023", "18-04-2023");
		hotelSystem.createReservation("R6", guest6, "25-06-2023", "28-06-2023");
		hotelSystem.createReservation("R7", guest7, "13-12-2023", "18-12-2023");
		
		
		
		System.out.println("=============: Reservation List :============================================");
		hotelSystem.listReservationsByGuest(guest1);   // Listing reservations for guests
		hotelSystem.listReservationsByGuest(guest2);
		hotelSystem.listReservationsByGuest(guest3);
		hotelSystem.listReservationsByGuest(guest4);
		hotelSystem.listReservationsByGuest(guest5);
		hotelSystem.listReservationsByGuest(guest6);
		hotelSystem.listReservationsByGuest(guest7);
		
		
		
		
		hotelSystem.createReservation("R8", guest4, "27-05-2023", "30-05-2023");    // Multiple Reservations 
		hotelSystem.createReservation("R9", guest5, "14-03-2023", "17-03-2023");
		
		
		System.out.println("=================: Multiple Reservation :=====================================");
		hotelSystem.listReservationsByGuest(guest4);
		hotelSystem.listReservationsByGuest(guest5);
		
		
		
		hotelSystem.updateReservationDates("R1", "03-12-2023", "08-12-2023");   // Updating reservation dates
		hotelSystem.updateReservationDates("R6", "25-07-2023", "28-07-2023");
		
		
        System.out.println("===============: Reservation List After Update :================================");
		hotelSystem.listReservationsByGuest(guest1);    // Listing reservations after update
		hotelSystem.listReservationsByGuest(guest6);
	
		
	
	     hotelSystem.cancelReservation("R2");  // Cancelling a reservation
	     hotelSystem.cancelReservation("R7");
	     
	     
	     System.out.println("===========: Reservation Cancelled Guests :=======================================");
	     hotelSystem.listReservationsByGuest(guest2);  // Listing reservations after cancellation
	     hotelSystem.listReservationsByGuest(guest7);
	
	}

}

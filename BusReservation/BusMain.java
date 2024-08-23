package BusReservation;
import java.util.*;
public class BusMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(750,false,3));
		buses.add(new Bus(764,true,51));
		buses.add(new Bus(751,false,47));
		for(Bus bus:buses) {
			bus.displayInfo();
		}
		
		while (true) {
			System.out.println("Enter '1' to continue booking, Enter '0' to cancel the process.");
			int userOption=scanner.nextInt();
			if (userOption==1) {
				Booking booking=new Booking();
				if (booking.isAvailable(bookings,buses)) {
					System.out.println("Your Booking is placed");
					bookings.add(booking);
				}
				else {System.out.println("Sorry, Booking is full.");}
			}
			else {System.out.println("Thank You for visiting.");break;}
		}
	
	}
}

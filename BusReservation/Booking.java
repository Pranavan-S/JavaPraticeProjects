package BusReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
public class Booking {
	 private Date date;
	 private int routeNo;
	 private String userName;
	
	Booking(){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Name :");
		this.userName=scanner.nextLine();
		
		System.out.println("Date:(dd-mm-yyyy)");
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.date=dateFormat.parse(scanner.next());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Route No:");
		this.routeNo=scanner.nextInt();
		
		
	}
	int booked=0;
	int capacity;
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>buses) {
		for(Bus bus:buses) {
			if (bus.getRouteNo()==this.routeNo) {
				capacity=bus.getCapacity();
				break;
			}
		}
		for(Booking booking:bookings) {
			if (booking.routeNo==this.routeNo && booking.date.equals(this.date)) {
				booked++;
			}
		}
		return (capacity>booked)?true:false;
	}		
}

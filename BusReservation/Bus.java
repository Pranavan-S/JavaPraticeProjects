package BusReservation;

public class Bus {
	private int capacity;
	private boolean AC;
	private int routeNo;
	
	Bus(int routeNo,boolean AC,int capacity){
		this.routeNo=routeNo;
		this.AC=AC;
		this.capacity=capacity;
	}
	
	public int getCapacity() {return capacity;}
	public boolean getAcInfo() {return AC;}
	public int getRouteNo() {return routeNo;}
	public void displayInfo() {
		System.out.println(String.format("Route: %3d with %s *",this.routeNo,(this.AC==true)?"AC":"Non-AC"));
	}
}

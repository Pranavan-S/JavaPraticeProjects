package builder_0;

public class Car {
	int seatCount;
	String seatType;
	double tankCapacity;
	double mileage;
	String color;
	String designStyle;
	Chip motherChip;
	public Car(int seatCount, String seatType, double tankCapacity, double mileage, String color, String designStyle,Chip motherChip) {
		this.seatCount = seatCount;
		this.seatType = seatType;
		this.tankCapacity = tankCapacity;
		this.mileage = mileage;
		this.color = color;
		this.designStyle = designStyle;
		this.motherChip = motherChip;
	}
	
	public void showOff() {
		System.out.println("My car has "+ this.seatCount+ " seats. And it is "+this.color+".");
	}
}

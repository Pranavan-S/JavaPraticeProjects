package builder_0;

public class CarManual {
	int seatCount;
	String seatType;
	double tankCapacity;
	double mileage;
	String color;
	String designStyle;
	Chip motherChip;
	public CarManual(int seatCount, String seatType, double tankCapacity, double mileage, String color, String designStyle,Chip motherChip) {
		this.seatCount = seatCount;
		this.seatType = seatType;
		this.tankCapacity = tankCapacity;
		this.mileage = mileage;
		this.color = color;
		this.designStyle = designStyle;
		this.motherChip = motherChip;
	}
	
	public void readManual() {
		System.out.println("Your car has a chip with "+this.motherChip.cores+" cores with speed of "+this.motherChip.clkSpeed+".");
	}
}

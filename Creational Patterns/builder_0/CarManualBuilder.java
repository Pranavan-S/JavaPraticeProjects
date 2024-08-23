package builder_0;

public class CarManualBuilder implements Builder{
	int seatCount;
	String seatType;
	double tankCapacity;
	double mileage;
	String color;
	String designStyle;
	Chip motherChip;
	
	public void setSeatCount(int count) {
		this.seatCount = count;
	}

	public void setSeatType(String type) {
		this.seatType = type;
	}

	public void setTankCapacity(double capacity) {
		this.tankCapacity = capacity;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDesignStyle(String style) {
		this.designStyle = style;
	}

	public void setChip(Chip chip) {
		this.motherChip = chip;
	}
	
	public CarManual getManual() {
		return new CarManual(seatCount, seatType, tankCapacity, mileage, color,designStyle,motherChip);
	}
}

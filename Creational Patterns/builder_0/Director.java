package builder_0;

public class Director {
	public void constructSportsCar(Builder builder) {
		builder.setSeatCount(2);
		builder.setSeatType("Polymer");
		builder.setTankCapacity(101.56);
		builder.setMileage(30);
		builder.setColor("Black");
		builder.setDesignStyle("Modern");
		builder.setChip(new Chip(8,2.33));
	}
	
	public void constructSUV(Builder builder) {
		builder.setSeatCount(4);
		builder.setSeatType("Leather");
		builder.setTankCapacity(40.56);
		builder.setMileage(60);
		builder.setColor("Fancy");
		builder.setDesignStyle("Geometrical");
		builder.setChip(new Chip(2,1.95));
	}
	
	public void constructSportsCarManual(Builder builder) {
		builder.setSeatCount(2);
		builder.setSeatType("Polymer");
		builder.setTankCapacity(101.56);
		builder.setMileage(30);
		builder.setColor("Black");
		builder.setDesignStyle("Modern");
		builder.setChip(new Chip(8,2.33));
	}
	
	public void constructSUVManual(Builder builder) {
		builder.setSeatCount(4);
		builder.setSeatType("Leather");
		builder.setTankCapacity(40.56);
		builder.setMileage(60);
		builder.setColor("Fancy");
		builder.setDesignStyle("Geometrical");
		builder.setChip(new Chip(2,1.95));
	}
}

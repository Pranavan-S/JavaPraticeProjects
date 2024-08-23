package builder_0;

public class Main {
	public static void main(String args[]) {
		
		Director director = new Director();

		CarBuilder carBuilder = new CarBuilder();
		director.constructSportsCar(carBuilder);
		Car my_sport_car = carBuilder.getCar();
		my_sport_car.showOff();
		
		director.constructSUV(carBuilder);
		Car my_suv = carBuilder.getCar();
		my_suv.showOff();
		
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCarManual(manualBuilder);
		CarManual my_manual = manualBuilder.getManual();
		my_manual.readManual();
		
	}
}

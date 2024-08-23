package factory_0;

public class Main {
	public static void main(String args[]) {
		//Benz car ABS controller.
		CarABSController carabsc = new CarABSController();
		carabsc.install();
		
		//Leyland Truck ABS controller.
		TruckABSController truckabsc = new TruckABSController();
		truckabsc.install();
	}
}

package factory_0;

//concrete factory 02
public class TruckABSController extends ABSController{
	
	//overriding the factory method.
	public ABSSensor makeABSSensor() {
		log("Making a Truck ABS Sensor.");
		return new TruckABSSensor();
	}
}

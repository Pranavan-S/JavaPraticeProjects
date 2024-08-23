package factory_0;

//concrete factory 01
public class CarABSController extends ABSController{
	
	//overriding the factory method.
	public ABSSensor makeABSSensor() {
		log("Making Car ABS Sensor.");
		return new CarABSSensor();
	}
}

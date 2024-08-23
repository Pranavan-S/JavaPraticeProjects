package adapter_0;

//Adapter class

public class DistanceSensor implements Sensor{
	SensorModule sm;
	
	DistanceSensor(){
		sm =new SensorModule();
	}
	
	public double getDistance() {
		double vout = sm.getVoltage();
		//we can corresponding distance using the voltage obtained from the sensor module and data sheet of the sensor module.
		
		// actual distance is obtained from the data sheet of the sensor module.
		double distance = vout/5; //just a mock value.
		return distance;
	}
}

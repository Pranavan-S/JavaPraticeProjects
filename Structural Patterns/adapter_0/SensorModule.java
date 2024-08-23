package adapter_0;

// this sensor module can give only voltage as output.
// but my car need distance where obstacles are at.
// i need to convert it into distance using adapter class


// Adaptee class
public class SensorModule {
	double outputVoltage;
	SensorModule(){
		outputVoltage = 0; //just a mock value.
	}
	
	public double getVoltage() {
		System.out.println("Sensor Module is giving a voltage reading.");
		outputVoltage = 2.556; //just for an example.
		return outputVoltage;
	}
}

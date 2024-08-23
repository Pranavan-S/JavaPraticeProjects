package bridge_0;

public class SmartGreenHouseApp {
	public static void main(String args[]) {
		AgroBot wb = new WaterBot(new MoisureSensor(),new WaterTapActuator());
		AgroBot fb = new FertilizerBot(new NitrogenSensor(),new FertilizerDoorActuator());
		wb.doWork();
		System.out.println("------");
		fb.doWork();
	}
}

package adapter_0;

//client.

public class MoonRover {
	public static void main(String args[]) {
		Sensor s = new DistanceSensor();
		System.out.println("Obstacle is at "+s.getDistance());
	}
}

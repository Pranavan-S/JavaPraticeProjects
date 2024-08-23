package bridge_0;

//complete implementation of Implementor.
public class WaterTapActuator implements SACModule{
	public int doWork() {
		System.out.println("Opening the water tap.");
		return 0;
	}
}

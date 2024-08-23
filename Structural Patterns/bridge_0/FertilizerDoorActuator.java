package bridge_0;

//complete implementation of Implementor.
public class FertilizerDoorActuator implements SACModule{
	public int doWork() {
		System.out.println("Opening the fertilizer door.");
		return 0;
	}
}

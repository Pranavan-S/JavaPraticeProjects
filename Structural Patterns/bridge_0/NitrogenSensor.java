package bridge_0;

//complete implementation of Implementor.
public class NitrogenSensor implements SACModule {
	public int doWork() {
		System.out.println("Getting Nitrogen level.");
		return 2; //mock value
	}
}

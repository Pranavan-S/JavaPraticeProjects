package bridge_0;

//complete implementation of Implementor.
public class MoisureSensor implements SACModule{
	public int doWork() {
		System.out.println("Getting moisure level.");
		return 3; //mock value
	}
}

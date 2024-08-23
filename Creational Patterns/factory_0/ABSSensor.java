package factory_0;

//generic product
public abstract class ABSSensor {
	public void log(String message) {
		System.out.println(message);
	}
	public void install() {
		log("This is Generic ABS Sensor.");
	}
}

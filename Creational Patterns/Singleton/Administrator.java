package Singleton;

public class Administrator {
	private static final Administrator admin = new Administrator();
	int count = 0;
	private Administrator() {
	}
	public static Administrator getInstance() {
		return admin;
	}
}

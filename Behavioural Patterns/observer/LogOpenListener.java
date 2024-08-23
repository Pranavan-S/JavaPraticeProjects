package observer;

import java.io.File;

//concrete observer
public class LogOpenListener implements EventListener{
	private File log;
	
	public LogOpenListener(String fileName) {
		this.log = new File(fileName);
	}
	
	public void update(String eventType, File file) {
		System.out.println("Save to log "+log+" : someone has performed "+eventType+" on "+file.getName());
	}
}

package observer;
import java.io.File;

//concrete observer
public class EmailNotificationListener implements EventListener {
	private String email;
	
	public EmailNotificationListener(String email) {
		this.email = email;
	}
	
	public void update(String eventType, File file) {
		System.out.println("Email to "+email+" : someone has performed "+eventType+" on "+file.getName());
	}
}

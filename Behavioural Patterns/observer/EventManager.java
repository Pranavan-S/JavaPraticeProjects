package observer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.File; //for file obj.


//base publisher
public class EventManager {
	//subscribers list.
	HashMap<String, List<EventListener>> listeners = new HashMap<>();
	
	public EventManager(String... operations) {
		//creating subscribers list for each event.
		for (String operation:operations) {
			listeners.put(operation,new ArrayList<>());
		}
	}
	
	public void subscribe(String eventType, EventListener listener) {
		//adding subscribers.
		listeners.get(eventType).add(listener);
	}
	
	public void unsubscribe(String eventType, EventListener listener) {
		//removing subscribers.
		listeners.get(eventType).remove(listener);
	}
	
	public void notify(String eventType, File file) {
		                             //getting observers of the particular event.
		for (EventListener observer: listeners.get(eventType)) {
			observer.update(eventType, file);
		}
	}
}

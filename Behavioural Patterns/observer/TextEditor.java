package observer;
import java.io.File;

//concrete publisher class. (some time this class can be derived from base publisher class.)
//includes the business logic
public class TextEditor {
	public EventManager events;
	private File file;
	
	public TextEditor() {
		this.events = new EventManager("open","save");
	}
	
	public void openFile(String filePath) {
		this.file = new File(filePath); //to mock the file opening.
		events.notify("open",file);
	}
	
	public void saveFile(String filePath) {
		if (this.file != null) {
			events.notify("save",file);
		}
		else {
			System.out.println("Please open a file first");
		}
	}
}

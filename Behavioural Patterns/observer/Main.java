package observer;

public class Main {

	public static void main(String[] args) {
		TextEditor editor  = new TextEditor();
		editor.events.subscribe("open", new LogOpenListener("editor_log"));
		editor.events.subscribe("save", new EmailNotificationListener("abc123@mail.com"));
		
		editor.openFile("My self.txt");
		editor.saveFile("My self1.txt");
	}

}

package abstract_factory_0;

public class Main {
	public static void main(String args[]) {
		FilterFactory ff = new FilterFactory();
		PhotoEditorApp app = new PhotoEditorApp(ff);
		
		Image myImg = new Image("Childhood.jpeg");
		app.blur(myImg);
		app.sharpen(myImg);
		
	}
}

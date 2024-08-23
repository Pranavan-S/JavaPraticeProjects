package abstract_factory_0;

public class SharpenFilter implements ISharpenFilter{
	public Image apply(Image img) {
		System.out.println("Processing Sharpen Edge filter.");
		return img;
	}
}

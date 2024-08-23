package abstract_factory_0;

public class BlurFilter implements IBlurFilter {
	public Image apply(Image img) {
		System.out.println("Processing with the Blur Filter.");
		return img;
	}
}

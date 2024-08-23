package abstract_factory_0;

public class EdgeDetectFilter implements IEdgeDetectFilter {
	public Image apply(Image img) {
		System.out.println("Processing with the Edge detect Filter.");
		return img;
	}
}

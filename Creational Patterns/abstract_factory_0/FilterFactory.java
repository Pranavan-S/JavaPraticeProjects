package abstract_factory_0;

public class FilterFactory implements IFilterFactory{
	public BlurFilter createBlurFilter() {
		return new BlurFilter();
	}
	public EdgeDetectFilter createEdgeDetectFilter() {
		return new EdgeDetectFilter();
	}
	public SharpenFilter createSharpenFilter() {
		return new SharpenFilter();
	}
}

package abstract_factory_0;

public interface IFilterFactory {
	public BlurFilter createBlurFilter();
	public EdgeDetectFilter createEdgeDetectFilter();
	public SharpenFilter createSharpenFilter();
}

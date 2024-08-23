package abstract_factory_1;

public class RyzenFactory implements IComponentFactory {
	public IProcessor createProcessor() {
		return new RyzenProcessor();
	}
	public IHarddisk createHarddisk() {
		return new RyzenHarddisk();
	}
	public IGpu createGpu(){
		return new RyzenGpu();
	};
}

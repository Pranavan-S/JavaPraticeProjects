package abstract_factory_1;

public interface IComponentFactory {
	public IProcessor createProcessor();
	public IHarddisk createHarddisk();
	public IGpu createGpu();
}

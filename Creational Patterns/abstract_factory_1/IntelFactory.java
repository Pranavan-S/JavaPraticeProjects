package abstract_factory_1;

public class IntelFactory implements IComponentFactory{
	public IProcessor createProcessor() {
		return new IntelProcessor();
	}
	public IHarddisk createHarddisk() {
		return new IntelHarddisk();
	}
	public IGpu createGpu(){
		return new IntelGpu();
	};
}

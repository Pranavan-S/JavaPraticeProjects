package abstract_factory_1;
//client
public class ComputerSimulator {
	IComponentFactory cf;
	IProcessor p;
	IHarddisk h;
	IGpu g;
	ComputerSimulator(IComponentFactory cf){
		this.cf = cf;
		System.out.println("System is working.");
		p = cf.createProcessor();
		h = cf.createHarddisk();
		g = cf.createGpu();
	}
	public void initiateProcessor() {
		p.doProcessing();
	}
	public void initiateHarddisk() {
		h.store();
	}
	public void initiateGpu() {
		g.render();
	}
}

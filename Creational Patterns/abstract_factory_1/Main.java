package abstract_factory_1;

public class Main {
	public static void main(String args[]) {
		IComponentFactory cp = new RyzenFactory();
		ComputerSimulator vm = new ComputerSimulator(cp);
		vm.initiateProcessor();
		vm.initiateHarddisk();
		vm.initiateGpu();
	}
}

package composite_0;
//base plant class
abstract class Plant{
	String id;
	
	Plant(String id){
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	abstract void report();
	abstract boolean install(Plant p);
}

//leaf class
class Leaf extends Plant{
	Leaf(String id){
		super(id);
	}
	
	public void report() {
		System.out.println(this.getId() +": I am reporting.");
	}
	
	public boolean install(Plant p) {
		System.out.println("Leaf can't install other plants.");
		return false;
	}
}


//composite class
class CompositePlant extends Plant{
	private Plant[] children;
	private int subPlantCount;
	private int subPlantPointer;
	
	
	CompositePlant(String id, int count){
		super(id);
		this.subPlantCount = count;
		children = new Plant[count];
		subPlantPointer = 0;
	}
	
	public void report() {
		System.out.println(this.getId()+": I am reporting.");
		for (Plant p : children) {
			p.report();
		}
	}
	
	public boolean install(Plant p) {
		System.out.println(this.getId()+": Installing "+p.getId());
		if (subPlantPointer<subPlantCount) {
			children[subPlantPointer++] = p;
		}
		return true;
	}
}

//client
public class CompositeDemo {
	public static void main(String[] args) {
		Plant p1 = new Leaf("P1");
		Plant p2 = new Leaf("P2");
		Plant p3 = new Leaf("P3");
		Plant p4 = new Leaf("P4");
		
		p1.install(p2);
		
		Plant p5 = new CompositePlant("P5",2);
		p5.install(p1);
		p5.install(p2);
		
		Plant p6 = new CompositePlant("P6",2);
		p6.install(p3);
		p6.install(p4);
		
		Plant p7 = new CompositePlant("P7",2);
		p7.install(p5);
		p7.install(p6);
		
		p7.report();
		
	}
}

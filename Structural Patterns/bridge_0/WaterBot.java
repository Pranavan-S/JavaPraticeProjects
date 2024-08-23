package bridge_0;

//refinement of the abstraction
public class WaterBot extends AgroBot {
	WaterBot(SACModule sacm1, SACModule sacm2){
		super(sacm1,sacm2);
	}
	public void doWork() {
		if(sacm1.doWork()<7) {
			sacm2.doWork();
		}
	}
}

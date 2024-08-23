package bridge_0;


//refinement of the abstraction
public class FertilizerBot extends AgroBot {
	FertilizerBot(SACModule sacm1, SACModule sacm2){
		super(sacm1,sacm2);
	}
	public void doWork() {
		if(sacm1.doWork()<10) {
			sacm2.doWork();
		}
	}
}

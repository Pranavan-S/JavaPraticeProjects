package bridge_0;

//high level abstraction
public abstract class AgroBot {
	protected SACModule sacm1,sacm2;
	AgroBot(SACModule sacm1, SACModule sacm2){
		this.sacm1 = sacm1;
		this.sacm2 = sacm2;
	}
	abstract void doWork();
}

package factory_0;

//generic factory
//creating object is not the only purpose of this factory class; it can deal with some other core logics.
public abstract class ABSController {
	ABSSensor abss;
	
	//method for checking the output; no impact on factory pattern stuffs
	public void log(String message) {
		System.out.println(message);
	}
	
	//factory method
	public abstract ABSSensor makeABSSensor();
	
	//this install method is for attaching ABSS into ABS controller.
	//Don't confuse with the install method under ABSSensor class.
	public void install() {
		abss = makeABSSensor();
		abss.install();
	}
	
}

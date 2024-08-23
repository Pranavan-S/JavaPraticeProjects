package prototype_0;

public class Square implements ClonableShapes {
	
	private int slength;
	private String color;
	
	Square(int slength, String color){
		this.slength = slength;
		this.color = color;
	}
	
	Square(Square target){
		this.slength = target.slength;
		this.color = target.color;
	}
	
	public Square clone() {
		return new Square(this);
	}
	
	public void display() {
		System.out.println("Side Length: "+ slength +"    Color: "+color);
	}
}

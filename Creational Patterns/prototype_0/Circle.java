package prototype_0;

public class Circle implements ClonableShapes {
	
	private int radius;
	private String color;
	
	Circle (int r, String color){
		this.radius = r;
		this.color = color;
	}
	
	Circle (Circle target){
		this.radius = target.radius;
		this.color = target.color;
	}
	
	public Circle clone() {
		return new Circle(this);
	}
	
	public void display() {
		System.out.println("Radius: "+ radius +"    Color: "+color);
	}
}

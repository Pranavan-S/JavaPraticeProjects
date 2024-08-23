package prototype_0;
import java.util.HashMap;

public class PrototypeRegistry {
	HashMap<String, ClonableShapes> shapeCache = new HashMap<>();
	
	PrototypeRegistry(){
		Circle circle1 = new Circle(5, "Black");
		Circle circle2 = new Circle(25, "Blue");
		
		Square square1 = new Square(7,"Red");
		
		shapeCache.put("Small Black Circle", circle1);
		shapeCache.put("Big Blue Circle", circle2);
		shapeCache.put("Small Red Square", square1);
	}
	
	public void addToCache(String description,ClonableShapes target) {
		shapeCache.put(description, target);
	}
	
	public ClonableShapes getClone(String description) {
		return shapeCache.get(description).clone();
	}
	
}

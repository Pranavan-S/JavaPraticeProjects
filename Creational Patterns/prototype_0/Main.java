package prototype_0;

public class Main {

	public static void main(String[] args) {
		PrototypeRegistry cache = new PrototypeRegistry();
		Square original = new Square(6,"Pink");
		original.display();        //--------------------01
		
		Square duplicate = original.clone();
		duplicate.display();        //--------------------02
		
		cache.addToCache("Small Pink Square", original);
		
		Square clonedSquare = (Square) cache.getClone("Small Pink Square");
		clonedSquare.display();        //--------------------03
		
		
		Square clonedSquare1 = (Square) cache.getClone("Small Red Square");
		clonedSquare1.display();        //--------------------04
	}

}

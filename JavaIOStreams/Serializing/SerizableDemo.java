package Serializing;
import java.io.*;
import java.util.ArrayList;
class Dog implements Serializable{
	String name;
	Dog(String name){
		this.name = name;
	}
}
class Man implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //  ?
	int age;
	ArrayList<Dog> pets = new ArrayList<>();
	String name;
	boolean married;
	Man(String name, int age, boolean married){
		System.out.println("Constructor is called.");
		this.age = age;
		this.name = name;
		this.married = married;
		this.pets.add(new Dog("Puppy"));
		this.pets.add(new Dog("Chinna"));
	}
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Married: "+this.married);
		for (Dog d:this.pets) {
			System.out.println(d.name);
		}
	}
}

class Teacher extends Man{
	Teacher(String name,int age, boolean married){
		super(name,age,married);
	}
	
}
public class SerizableDemo {
	public static void main(String args[]) {
		Teacher father = new Teacher("Appa",64,true);
		System.out.println("First Object is Successfully created.");
		//Serialization.
		try {
			File mySer = new File("C:\\Users\\Pranavan_S\\Desktop\\Serialdemo.ser"); //java's representation of files.
			FileOutputStream fos = new FileOutputStream(mySer); //connecter stream.
			ObjectOutputStream oos = new ObjectOutputStream(fos); //output byte stream.
			oos.writeObject(father); //writing object the file.
			oos.close();
		}catch(IOException ex) {
			System.out.println("Error Occured.");
		}
		
		//De-serialization.
		try {
			File mySer = new File("C:\\Users\\Pranavan_S\\Desktop\\Serialdemo.ser");
			FileInputStream fis = new FileInputStream(mySer); //connecter stream.
			ObjectInputStream ois = new ObjectInputStream(fis); //input byte stream.
			Object obj = ois.readObject(); //reading object file from the file.
			
			ois.close();
			Teacher dada = (Teacher) obj; //constructor will not work here.
			dada.display();
			
		}catch(IOException|ClassNotFoundException ex) {
			System.out.println("Error Occured.");
		}
		
		//reading binary file using character oriented stream is a disaster.:)
				try {
					File myFile = new File("C:\\Users\\Pranavan_S\\Desktop\\Serialdemo.ser"); //java's representation of files.
					FileReader fr = new FileReader(myFile); //character oriented input stream.
					BufferedReader br = new BufferedReader(fr); //filter wrapper that provides buffering.
					//reading from the file using readLine() method.
//					String line = null;
//					while ((line = br.readLine()) != null) {
//						System.out.println(line);
//					}
					
					//reading from file using read() method.
					int letters;
					while ((letters = br.read()) != -1) {
						System.out.print((char) letters);
					}
					br.close();
					
				}catch(IOException ex){
					System.out.println("OOPS Error occured.");
				}
	}
}

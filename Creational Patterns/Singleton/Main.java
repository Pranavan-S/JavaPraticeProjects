package Singleton;

public class Main {
	public static void main(String args[]) {
		Administrator admin1 = Administrator.getInstance();
		(admin1.count)++;
		Administrator admin2 = Administrator.getInstance();
		(admin2.count)++;
		Administrator admin3 = Administrator.getInstance();
		(admin3.count)++;
		Administrator admin4 = Administrator.getInstance();
		(admin4.count)++;
		System.out.println(admin1.count);
		
		//as we get count = 4 : this implies that all the admin[i] objects created above point to a sole object.
	}
}

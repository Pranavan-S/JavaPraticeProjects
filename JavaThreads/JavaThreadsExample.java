package JavaThreads;
class MyThread1 extends Thread{
	public void run() {
		for (int i=1; i<6; i++) {
			System.out.println(i);
		}
	}
}

class MyThread2 implements Runnable{
	public void run() {
		for (int i=6; i<11; i++) {
			System.out.println(i);
		}
	}
}
public class JavaThreadsExample {
	public static void main(String args[]) {
		//method 1 of creating threads
		MyThread1 t1 = new MyThread1();
		
		
		//method 2 of creating threads
		Runnable r2 = new MyThread2();
//		MyThread2 r2 = new MyThread2();
		Thread t2 = new Thread(r2);
		
		//method3 of creating threads
		Runnable r3 = ()->
		{
			for (int i=11; i<16; i++) {
				System.out.println(i);
			}
		};
		Thread t3 = new Thread(r3);
		
		//method 4 of creating threads
		Thread t4 = new Thread() {
			public void run() {
				System.out.println("Hello");
			}
		};
		t1.start();
		t2.start();
						
					
		System.out.println();
		t3.start();
		t4.start();
		
	}
}

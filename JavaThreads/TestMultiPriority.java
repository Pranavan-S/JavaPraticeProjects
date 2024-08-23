package JavaThreads;


public class TestMultiPriority extends Thread{
public void run(){
System.out.println("thread name:"+Thread.currentThread().getName());
System.out.println("thread priority:"+Thread.currentThread().getPriority()+" thread name:"+Thread.currentThread().getName());
}
public static void main(String args[]){
TestMultiPriority m1=new TestMultiPriority();
m1.setName("m1");
TestMultiPriority m2=new TestMultiPriority();
m2.setName("m2");
m2.setPriority(Thread.MIN_PRIORITY);
m2.start();
m1.setPriority(Thread.MAX_PRIORITY);
m1.start();

Runnable t1 = () ->
	{
		System.out.println("Hello");
	};

Runnable t2 = () ->
	{
		System.out.println("Hello");
	};
	
Thread t3 = new Thread()
	{
		public void run() {
			System.out.println("Hello");
		}
		
	};
Runnable t4 = new Thread()
	{
		public void run() {
			System.out.println("Hello");
		}
		
	};
Runnable t5 = new Runnable()
	{
		public void run() {
			System.out.println("Hello");
		}
		
	};
}
}

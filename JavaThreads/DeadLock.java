package JavaThreads;

class BankAccount {
	 double balance;
	 int id;
	 
	 BankAccount(int id, double balance) {
		 this.id = id;
		 this.balance = balance;
	 }
	 void print1() {
		 System.out.println("Hello from "+Thread.currentThread().getName());
	 }
	 
	 static synchronized void print2() {
		 System.out.println("Hi from "+Thread.currentThread().getName());
	 }
	 void withdraw(double amount) {
		 // Wait to simulate io like database access ...
		 try {Thread.sleep(10l);} catch (InterruptedException e) {}
		 balance -= amount;
		 System.out.println("withdraw" + Thread.currentThread().getName());
	 }
	 
	 void deposit(double amount) {
		 // Wait to simulate io like database access ...
		 try {Thread.sleep(10l);} catch (InterruptedException e) {}
		 balance += amount;
		 System.out.println("deposit" + Thread.currentThread().getName());
	 }
	 
	 static synchronized void transfer(BankAccount from, BankAccount to, double amount) {
		 System.out.println("I am the Current: " + Thread.currentThread().getName());
		 
		 from.withdraw(amount);
		 to.deposit(amount);
//		 synchronized(from) {
//			 from.withdraw(amount);
//			 
//			 synchronized(to) {
//				 to.deposit(amount);
//			 }
//		 }
	 } 
}
public class DeadLock {
	public static void main(String args[]) {
		final BankAccount fooAccount = new BankAccount(1, 100d);
		final BankAccount barAccount = new BankAccount(2, 100d);
		 
		new Thread() {
			public void run() {
				BankAccount.transfer(fooAccount, barAccount, 10d);
				fooAccount.print1();

			}
		 }.start();
		 
		new Thread() {
			public void run() {
				 
				BankAccount.transfer(barAccount, fooAccount, 10d);
				fooAccount.print1();
			}
		}.start();
		

		 
	}
}

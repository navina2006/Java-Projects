package homework;
import java.util.*;
/*
class Bank{
	int balance = 1000;
	synchronized void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(Thread.currentThread().getName() +" Balance: " +balance);	
	}
}
public class Homework5 {
	public static void main(String[] args) {
		Bank o = new Bank();
		Thread t1 = new Thread(()->o.withdraw(500));
		Thread t2 = new Thread(()->o.withdraw(500));
		t1.start();
		t2.start();
	}
}
*/
/*
class Ticket{
	int ticket =1;
	 synchronized void book() {
	        if (ticket > 0) {
	            System.out.println(Thread.currentThread().getName()
	                    + " booked ticket");
	            ticket--;
	        } else {
	            System.out.println(Thread.currentThread().getName()
	                    + " no ticket available");
	        }
}
}
public class Homework5 {
	public static void main(String[] args) {
		Ticket o = new Ticket();
		Thread t1 = new Thread(()->o.book(),("user-1"));
		Thread t2 = new Thread(()->o.book(),("user-2"));	
		t1.start();
		t2.start();
	}	
	}
*/
/*
class shutDown extends Thread{
	shutDown(String name){
		super (name);
	}
		public void run() {
	        System.out.println(getName() + " started work");
	        try {
	            Thread.sleep(2000);  
	        } catch (Exception e) {
	        }
	        System.out.println(getName() + " finished work");
	    }
	}	

public class Homework5 {
	public static void main(String[] args) throws InterruptedException {
		shutDown o = new shutDown("Thread -1");
		shutDown o1 = new shutDown("Thread -2");
		o.start();
		o1.start();
		o.join();
		o1.join();
		System.out.println("Work Finished");
	}
	}
	*/



















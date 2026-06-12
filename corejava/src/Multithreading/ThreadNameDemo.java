package Multithreading;

class ThreadNameDemo0 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadNameDemo1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadNameDemo {
public static void main(String[] args) {
		System.out.println("Hellooo");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		ThreadNameDemo0 obj = new ThreadNameDemo0();
		obj.start();
		ThreadNameDemo1 obj1 = new ThreadNameDemo1();
		obj1.start();
	}
}


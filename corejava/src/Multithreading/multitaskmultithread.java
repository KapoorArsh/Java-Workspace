package Multithreading;

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread1");
	}
}
class MyThread1 extends Thread{
	public void run() {
		System.out.println("Thread2");
	}
}
class MyThread2 extends Thread{
	public void run() {
		System.out.println("Thread3");
	}
}
public class multitaskmultithread {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();
		MyThread1 arsh = new MyThread1();
		arsh.start();
		MyThread2 noorpal = new MyThread2();
		noorpal.start();
	}
}

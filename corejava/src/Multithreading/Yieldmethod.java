package Multithreading;

public class Yieldmethod extends Thread {
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	public static void main(String[] args) {
		Yieldmethod obj = new Yieldmethod();
		obj.start();
		Thread.yield(); //if you want main method to stop and provide chance to other threads for execution
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

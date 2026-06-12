package Multithreading;

public class Joinmethod2 extends Thread {
	static Thread mainthread;
	public void run() {
		try {
			mainthread.join();
			for (int i = 0; i < 6; i++) {
				Thread.sleep(500);
				System.out.println("Child Thread " + i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		mainthread = Thread.currentThread();
		Joinmethod2 obj = new Joinmethod2();
		obj.start();
		try {
			for (int i = 0; i < 6; i++) {
				Thread.sleep(500);
				System.out.println("Parent Thread " + i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

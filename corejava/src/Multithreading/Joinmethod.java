package Multithreading;

public class Joinmethod extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Child Thread " + i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws Exception {
		Joinmethod obj = new Joinmethod();
		obj.start();
		obj.join();
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Parent Thread " + i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

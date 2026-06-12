package Multithreading;

public class ThreadClass extends Thread {
	public void run() {
		for(int i = 0; i<11;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadClass obj = new ThreadClass();
		obj.start();
	}
}

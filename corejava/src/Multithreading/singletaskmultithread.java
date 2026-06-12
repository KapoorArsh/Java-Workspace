package Multithreading;

public class singletaskmultithread extends Thread {
	public void run() {
		System.out.println("Noorpal Im sorry!");
	}
	public static void main(String[] args) {
		singletaskmultithread obj = new singletaskmultithread();
		obj.start();
		singletaskmultithread bestobj = new singletaskmultithread();
		bestobj.start();
	}
}

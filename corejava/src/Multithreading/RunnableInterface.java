package Multithreading;

public class RunnableInterface implements Runnable {
	public void run() {
		for(int i = 0;i<11;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		RunnableInterface obj = new RunnableInterface();
		Thread bestobj = new Thread(obj);
		bestobj.start();
		bestobj.start();
	}
}

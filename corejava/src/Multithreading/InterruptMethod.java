package Multithreading;

public class InterruptMethod extends Thread{
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
			System.out.println("Thread Interrupted " + e);
		}
	}
	public static void main(String[] args) {
		InterruptMethod obj = new InterruptMethod();
		obj.start();
		obj.interrupt();
	}
}

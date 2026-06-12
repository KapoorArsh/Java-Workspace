package Multithreading;

public class DaemonThreadDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("God Thread");
		if(Thread.currentThread().isDaemon()) {
		System.out.println("Daemon Thread");
	}else {
		System.out.println("God Thread");
	}
}
	public static void main(String[] args) {
		System.out.println("Human Thread");
		DaemonThreadDemo obj = new DaemonThreadDemo();
		obj.setDaemon(true);
		obj.start();
	}
}
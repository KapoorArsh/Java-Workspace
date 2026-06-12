package Multithreading;

public class Sleepmeth {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 101; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}
}

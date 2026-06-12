package corejava;

public class sum {
	public static void main(String[] args) {
		int a;
		int b = 10;
		int c = 0;
		for(a = 1; a<=b;++a) {
			c = c + a;
		}
		System.out.println("Sum of first 10 numbers: " + c);
	}
}

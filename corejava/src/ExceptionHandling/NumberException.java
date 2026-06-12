package ExceptionHandling;

public class NumberException {
	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt("Hello");
			System.out.println(n1);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}

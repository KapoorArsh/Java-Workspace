package ExceptionHandling;

public class StringException {
	public static void main(String[] args) {
		try {
			String s1 = null;
			System.out.println(s1.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}

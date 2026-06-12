package ExceptionHandling;

public class SException {
public static void main(String[] args) {
	try {
		String s = "HII hllo Welcome tata";
		char c = s.charAt(69);
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
}
}

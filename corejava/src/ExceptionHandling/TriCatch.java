package ExceptionHandling;

public class TriCatch {
	public static void main(String[]args) {
		int a=10,b=0,c;
		try {
			c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("Hello!");
	}
}

package ExceptionHandling;
import java.util.Scanner;
public class Throw {
	static void circum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of r: ");
		int r = sc.nextInt();
		double cir1 = 2*3.14*r;
		if(r<=0) {
			throw new ArrayIndexOutOfBoundsException("Radius can't be zero");
		}
		else {
			System.out.println(cir1);
		}
		}
	public static void main(String[]args) {
		try {
			circum();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
//			System.out.println(e);
		}
	}
}
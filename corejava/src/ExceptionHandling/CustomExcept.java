package ExceptionHandling;
import java.util.Scanner;
class NegRadiusException extends Exception{
	public NegRadiusException(String st) {
	}
	public String toString() {
		return "Radius can't be Negative";
	}
	public String getMessage() {
		return "Radius can't be Negative";
	}
}
public class CustomExcept {
	static void circum() throws NegRadiusException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of radius: ");
		int r = sc.nextInt();
		double cir1 = 2*3.14*r;
		if (r<0) {
			throw new NegRadiusException("Radius can't be negative!");
		}
		else {
		System.out.println(cir1);
	}
	}
	public static void main(String[] args) {
		try {
			circum();
		}
		catch(NegRadiusException e) {
			System.out.println(e);
		}
	}
}

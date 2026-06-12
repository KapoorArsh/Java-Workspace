package ExceptionHandling;
import java.util.Scanner;
class NegException extends Exception{
	NegException(String message){
		super(message);
	}
	}
public class RadiusException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int a = sc.nextInt();
		try {
			if(a<0) {
				throw new NegException("Radius can't be zero");
			}
			else {
				System.out.println(2*3.14*a);
			}
		}catch(NegException e) {
			e.printStackTrace();
		}
	}
}

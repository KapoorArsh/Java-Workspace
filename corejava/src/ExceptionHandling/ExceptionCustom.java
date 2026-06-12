package ExceptionHandling;
import java.util.Scanner;
class UnderAgeException extends Exception{
	UnderAgeException(String message){
		super(message);
	}
	}
public class ExceptionCustom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int a = sc.nextInt();
		try {
			if(a<18) {
				throw new UnderAgeException("You are not eligible to vote");
			}
			else {
				System.out.println("Go and Vote");
			}
		}catch(UnderAgeException e) {
			e.printStackTrace();
		}
	}
}

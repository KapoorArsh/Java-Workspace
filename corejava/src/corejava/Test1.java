package corejava;
import java.util.Scanner;
public class Test1 {
	static void arrinput(int a){
		if(a>=18) {
			System.out.println("You are eligible to vote.");
		}
		else {
			System.out.println("You are not eligible to vote.");
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  your age: ");
		int age = sc.nextInt();
		arrinput(age);
	}
}

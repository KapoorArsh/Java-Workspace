package corejava;
import java.util.Scanner;
public class Question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of books in library: ");
		int a = sc.nextInt();
		System.out.println("Enter no. of books already issued: ");
		int b = sc.nextInt();
		System.out.println("Enter total no. of books you need: ");
		int c = sc.nextInt();
		int d = a - b;
		if(d >= c) {
			System.out.println("Success, there are " + d + " books present in library.");
		}
		else {
			System.out.println("Not enough books present in library.");
		}
	}
}

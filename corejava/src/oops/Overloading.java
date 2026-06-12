package oops;
import java.util.Scanner;
public class Overloading {
	public void add(int a) {
		System.out.println("This is number submitted: ");
		System.out.println(a);
	}
	public void add(int a,int b) {
		System.out.println("This is addition");
		System.out.println(a+b);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the number you want to print: ");
		int a = sc.nextInt();
		System.out.println("What are the numbers you want to add: ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		Overloading m = new Overloading();
		m.add(a);
		m.add(b,c);
}
}
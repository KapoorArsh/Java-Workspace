package corejava;
import java.util.Scanner;
public class Classes {
	public void odd(int a) {
		int b = a%2;
		if(b==0) {
			System.out.println("This number is not odd.");
		}
		else {
			System.out.println("This is an odd number.");
		}
			
	}
	public int arearect(int c,int f) {
		System.out.println("This is the area of rectangle: ");
		return c*f;
	}
	public void numeral() {
		for(int i = 0;i<10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		Classes d = new Classes();
		d.odd(a);
		System.out.println("Enter length of rectangle: ");
		int c = sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		int f = sc.nextInt();
		Classes m = new Classes();
		System.out.println(m.arearect(c, f));
		Classes g = new Classes();
		System.out.println("This is numeral numbers.");
		g.numeral();
	}
}

package corejava.Java8.Lambda;
import java.util.Scanner;
public class Firstclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number: ");
//		int x = sc.nextInt();
//		System.out.println("Enter second number: ");
//		int y = sc.nextInt();
//		int d = 7;
//		MyInter t =()-> System.out.println(a);
//		t.run();
//		System.out.println("This is the sum: ");
//		SumInter m =(a,b)->{return x+y;};
//		System.out.println(m.sum(x, y));
		System.out.println("Enter your name: ");
		String p = sc.nextLine();
		System.out.println("This is the length of your name: ");
		StringInter l =(a)-> System.out.println(p.length());
		l.Length(p);
	}
}

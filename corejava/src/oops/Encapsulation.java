package oops;
import java.util.Scanner;
class a{
	private String pass;
	private int id;
	public String getValue() {
		return pass;
	}
	public void setValue(String password) {
		pass = password;
	}
	public int getV() {
		return id;
	}
	public void setV(int d) {
		id = d;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id: ");
		int b = sc.nextInt();
		System.out.println("Enter your password: ");
		String c = sc.next();
		a obj = new a();
		obj.setV(b);
		System.out.println("your id is: " + obj.getV());
		obj.setValue(c);
		System.out.println("your password is: " + obj.getValue());
	}
}

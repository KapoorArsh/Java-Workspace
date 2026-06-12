package oops;
import java.util.Scanner;
public class T2 {
	int id;
	String name;
	String city;
	
	T2(int id,String name,String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return id + " " + name + " " + city;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int a = sc.nextInt();
		System.out.println("Enter name: ");
		String b = sc.next();
		System.out.println("Enter city: ");
		String c = sc.next();
		T2 d1 = new T2(a,b,c);
		System.out.println(d1);
		System.out.println(d1 instanceof T2);
	}
}
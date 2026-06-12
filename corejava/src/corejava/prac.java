package corejava;

import java.util.Scanner;

public class prac {
	Long phn;
	String name;
	Scanner sc = new Scanner(System.in);
	void getemp() {
			System.out.println("Get phone number: ");
			phn = sc.nextLong();
			String p = Long.toString(phn);
			String newp = p.substring(7, 10);
			System.out.println("Enter Name: ");
			sc.nextLine();
			name = sc.nextLine();
			Integer newid = Integer.parseInt(newp);
			StringBuffer str = new StringBuffer(newp);
			System.out.println(str.append(name));
			System.out.println(str.reverse());
			System.out.println(newid);
			String[] arr = name.split(" ");
			String firstname = arr[0];
			String lastname = arr[1];
			System.out.println(firstname);
			System.out.println(lastname);
	}
	public static void main(String[] args) {
		prac obj = new prac();
		obj.getemp();
	}
}

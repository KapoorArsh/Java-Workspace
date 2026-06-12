package corejava;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		char c = sc.next().charAt(5);
		System.out.println("Character at index 5: " + c);	
	}
}

package corejava;
import java.util.Scanner;
public class arrInput {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give 1D array size: ");
		int a = sc.nextInt();
		int arr [] = new int[a];
		System.out.println("Write your array: ");
		for (int i =0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("This is your array: ");
		for (int i = 0;i<a;i++) {
			System.out.println(arr[i]);
		}
	}
	
}

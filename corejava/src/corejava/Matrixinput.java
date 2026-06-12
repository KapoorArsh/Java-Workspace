package corejava;
import java.util.Scanner;
public class Matrixinput {
	static void matrix(int arr[]){
		System.out.println("This is your array: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in array: ");
		int a = sc.nextInt();
		int arr[]= new int [a];
		System.out.println("Enter elements in array: ");
		for(int i = 0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		matrix(arr);
	}
}

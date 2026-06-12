package corejava;
import java.util.Scanner;
public class arrInput2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows in array: ");
		int a = sc.nextInt();
		System.out.println("Enter no. of coloumns in array: ");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		System.out.println("Enter your 2D array: ");
		for(int i = 0; i<a;i++) {
			for(int j = 0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
			}
		System.out.println("This is your 2D array: ");
		for(int i = 0;i<a;i++) {
			for(int j = 0;j<b;j++) {
				System.out.print(arr[i][j] + " ");
		}
			System.out.println(" ");
		}
	}
}

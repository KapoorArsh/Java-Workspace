package corejava;
import java.util.Scanner;
public class matricadd {
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. of rows in 1st array: ");
			int a = sc.nextInt();
			System.out.println("Enter no. of coloumns in 1st array: ");
			int b = sc.nextInt();
			int arr[][] = new int[a][b];
			System.out.println("Enter your 1st 2D array: ");
			for(int i = 0; i<a;i++) {
				for(int j = 0;j<b;j++) {
					arr[i][j]=sc.nextInt();
				}
				}
			System.out.println("This is your 1st 2D array: ");
			for(int i = 0;i<a;i++) {
				for(int j = 0;j<b;j++) {
					System.out.print(arr[i][j] + " ");
			}
				System.out.println(" ");
			}
		System.out.println("Enter no. of rows in 2nd array: ");
		int c = sc.nextInt();
		System.out.println("Enter no. of coloumns in 2nd array: ");
		int d = sc.nextInt();
		int array[][] = new int[c][d];
		System.out.println("Enter your 2nd 2D array: ");
		for(int i = 0; i<a;i++) {
			for(int j = 0;j<b;j++) {
				array[i][j]=sc.nextInt();
			}
			}
		System.out.println("This is your 2nd 2D array: ");
		for(int i = 0;i<c;i++) {
			for(int j = 0;j<d;j++) {
				System.out.print(array[i][j] + " ");
		}
			System.out.println(" ");
		}
		System.out.println("This is array addition: "); 
		for(int i=0;i<a;i++){  
		for(int j=0;j<b;j++){   
		System.out.print(arr[i][j]+array[i][j]+" ");  
		}  
		System.out.println();  
		}  
		}
}


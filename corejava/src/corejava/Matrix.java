package corejava;
import java.util.Scanner;
public class Matrix {
	static void printM(int matrix [][]) {
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	static void Madd(int arr[][], int array[][],int a,int b,int c,int d) {
		if(a!=c||b!=d) {
			System.out.println("Wrong input");
			return;
		}
		else {
			for(int i = 0;i<arr.length;i++) {
				for(int j = 0;j<arr[i].length;j++) {
					System.out.print(arr[i][j] + array[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
	}
	static void Mmulti(int arr[][],int array[][],int a,int c,int d) {
	     int result [][] = new int[a][d];
	     for (int i = 0; i < a; i++) {
	        for (int j = 0; j < c; j++) {
	        	for (int k = 0; k < d; k++) {
	        		result[i][j] += arr[i][k] * array[k][j];
	                }
	        }
	     }
	     for(int i = 0;i<result.length;i++) {
				for(int j = 0;j<result[i].length;j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println(" ");
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows in 1st matrix: ");
		int a = sc.nextInt();
		System.out.println("Enter no. of cols in 1st matrix: ");
		int b = sc.nextInt();
		int arr[][]= new int[a][b];
		System.out.println("Enter values in 1st matrix: ");
		for(int i = 0;i<a;i++) {
			for(int j = 0;j<b;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st matrix is: ");
		printM(arr);
		System.out.println("Enter no. of rows in 2nd matrix: ");
		int c = sc.nextInt();
		System.out.println("Enter no. of cols in 2nd matrix: ");
		int d = sc.nextInt();
		int array[][]= new int[c][d];
		System.out.println("Enter values in 2nd matrix: ");
		for(int i = 0;i<c;i++) {
			for(int j = 0;j<d;j++) {
				 array[i][j]=sc.nextInt();
			}
		}
		System.out.println("2nd matrix is: ");
		printM(array);
		
		System.out.println("Addition of these matrices: ");
		Madd(arr,array,a,b,c,d);
		
		System.out.println("Multiplication of these matrices: ");
		Mmulti(arr,array,a,c,d);
	}
}

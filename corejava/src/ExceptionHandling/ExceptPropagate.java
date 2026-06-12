package ExceptionHandling;
import java.util.Scanner;
public class ExceptPropagate {
	void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give 1D array size: ");
		int a = sc.nextInt();
		int arr [] = new int[a];
		System.out.println("Write your array: ");
		for (int i =0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println("This is your array: ");
//		for (int i = 0;i<a;i++) {
//			System.out.println(arr[i+1]);
//	}
		System.out.println("This is your array: ");
	int i = 0;
	do {
		System.out.println(arr[i]);
		i++;
	}while(i<=a+1);
	}
	void method2() {
		method1();
	}
	void method3() {
		try {
			method2();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size reached!");
		}
	}
	public static void main(String[] args) {
		ExceptPropagate obj = new ExceptPropagate();
		obj.method3();
	}
}

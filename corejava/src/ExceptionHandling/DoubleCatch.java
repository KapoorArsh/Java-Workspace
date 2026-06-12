package ExceptionHandling;

public class DoubleCatch {
public static void main(String[] args) {
	int a = 10,b=0,c;
	try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[10]);
		c=a/b;
	}
	catch(ArrayIndexOutOfBoundsException d) {
		System.out.println(d);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
}
}

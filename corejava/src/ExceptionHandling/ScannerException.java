package ExceptionHandling;
import java.util.Scanner;
public class ScannerException {
	public static void main(String[] args) {
		Scanner sc = new Scanner("Helloooo");
		System.out.println(" " + sc.nextLine());
		System.out.println("Exception " + sc.ioException());
		sc.close(); // not necessary to write
	}
}

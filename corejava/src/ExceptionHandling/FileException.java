package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileException {
	public static void main(String [] args) {
		PrintWriter p;
		try {
			p = new PrintWriter("bubbly.txt");
			p.println("Saved");
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}

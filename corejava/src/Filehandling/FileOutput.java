package Filehandling;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutput {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\arshk\\OneDrive\\Desktop\\FileClass1.txt",false);
		String s = "Hellowelcome";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			fout.write(ch[i]);
		}
		System.out.println("done");
	}
}

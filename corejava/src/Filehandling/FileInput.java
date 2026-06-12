package Filehandling;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInput {
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin = new FileInputStream("C:\\Users\\arshk\\OneDrive\\Desktop\\FileClass1.txt");
		do {
			i = fin.read();
			if(i!=-1) {
				System.out.print((char)i);
			}
		}while(i!=-1);
		fin.close();
	}
}

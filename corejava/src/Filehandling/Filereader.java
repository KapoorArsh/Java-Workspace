package Filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\arshk\\OneDrive\\Desktop\\FileClass1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}
		br.close();
	}
}

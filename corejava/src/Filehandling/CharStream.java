package Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
	public static void main(String[] args) throws IOException {
		BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\arshk\\OneDrive\\Desktop\\FileClass1.txt"));
		bf.write("Computer");
		bf.close();
		System.out.println("done");
	}
}

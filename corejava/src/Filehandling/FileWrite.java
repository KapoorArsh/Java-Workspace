package Filehandling;

import java.io.FileWriter;

public class FileWrite {
	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("C:\\Users\\arshk\\OneDrive\\Desktop\\FileClas1.txt");
			f.write("Welcome");
			f.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success....");
	}
}

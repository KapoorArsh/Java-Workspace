package Filehandling;
import java.io.File;
import java.io.IOException;
public class Yourdadcreatedit {
	public static void main(String[] args) throws IOException  {
		File j = new File("C:\\Users\\arshk\\OneDrive\\Desktop\\Fileclass1.txt");
		System.out.println("Is exist?"+ j.exists());
		System.out.println("New file is created"+ j.createNewFile());
		System.out.println(j.length());
		System.out.println(j.getName());
	}
}

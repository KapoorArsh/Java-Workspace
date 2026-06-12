package corejava.Java9.features;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
public class TryCatchResources {
	    public static void main(String[] args) throws FileNotFoundException {  
	        try(FileOutputStream fileOutputStream = new FileOutputStream("beginnersbook.txt");){ 
	             //We are writing this string in the output file using FileOutputStream
	             String mystring = "We are writing this line in the output file."; 
	             
	             //Converting the given string in bytes
	             byte bytes[] = mystring.getBytes();       
	             
	             //Writing the bytes into the file
	             fileOutputStream.write(bytes);      
	             
	             //Displaying success message after the successful write operation
	             System.out.println("The given String is written in the file successfully");           
	        }catch(Exception e) {  
	            System.out.println(e);  
	        }         
	    }  
	}

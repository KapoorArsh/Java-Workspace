package corejava;
import java.util.Iterator;
import java.util.Scanner;
public class Arsh {
	Scanner sc = new Scanner(System.in);
	int id;
	String name1;
	int maths;
	int eng;
	int comp;
	int total1;
	int average1;
	String grade1;
void getstudent() {
	System.out.println("Enter student id: ");
	id = sc.nextInt();
	System.out.println("Enter student name: ");
	name1 = sc.next();
	System.out.println("Enter marks for maths: ");
	maths = sc.nextInt();
	System.out.println("Enter marks for english: ");
	eng = sc.nextInt();
	System.out.println("Enter marks for comp155: ");
	comp = sc.nextInt();
}
void total() {
	total1 = maths + eng + comp;
	average1 = total1/3;
	if(average1 > 90 || average1 == 90) {
		grade1 = "A";
	}else {
		grade1 = "B";
	}
}
void prn() {
	System.out.println("Student name: " + name1);
	System.out.println("Student id: " + id);
	System.out.println("Student total marks: " + total1);
	System.out.println("Student average marks: " + average1);
	System.out.println("Student grade: " + grade1);
}	
public static void main(String[] args) {
	Arsh obj = new Arsh();
	for(int i = 1;i <= 5;i++) {
		obj.getstudent();
		obj.total();
		obj.prn();
	}
}
}
//write a program to accept the marks for 5 students in 3 subjects, calculates the total average and grade
//criteria for grade 90> = a otherwise its b, print id name, total average and grade for each student.

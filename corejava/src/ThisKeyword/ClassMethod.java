package ThisKeyword;
class Student{
	void run() {
		System.out.println("Running");
	}
	void walk() {
		System.out.println("Walking");
		this.run();
	}
}
public class ClassMethod {
public static void main(String[] args) {
	Student s1=new Student();
	s1.walk();
}
}

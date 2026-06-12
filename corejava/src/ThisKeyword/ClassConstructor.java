package ThisKeyword;
class Stu{
	Stu(){
		this(10);
		System.out.println("Adding...........");
	}
	Stu(int x){
		//this();
		System.out.println("Subtracting...."+x);
	}
}
public class ClassConstructor {
public static void main(String[] args) {
	Stu s1=new Stu();
}
}

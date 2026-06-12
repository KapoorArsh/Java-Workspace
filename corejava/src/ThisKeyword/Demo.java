package ThisKeyword;
class Employee {
	int rollno;
	String name;
	float salary;
	 Employee (int rollno,String name,float salary){
	this.rollno=rollno;
	this.name=name;
	this.salary=salary;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+salary);
	}
}
public class Demo{
public static void main(String[] args) {
	 Employee  e1= new  Employee(1,"Avantii",3000f);
	 Employee e2= new  Employee(2,"Vijeta",6000f);
	e1.display();
	e2.display();
}
}

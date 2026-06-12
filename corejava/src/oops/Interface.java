package oops;
interface printable{
	void print();
	void add();
}
public class Interface implements printable{
	public void print() {
		System.out.println("Hello");
	}
	public void add() {
		for(int i = 0;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		Interface obj = new Interface();
		obj.print();
		obj.add();
	}
}

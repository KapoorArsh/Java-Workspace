package oops;
class Parent{
	void bubbly() {
		System.out.println("bubbly");
	}
}
public class Overriding extends Parent {
	void bubbly() {
		System.out.println("This is bubbly");
	}
	public static void main(String[]args) {
		Overriding m = new Overriding();
		m.bubbly();
	}
}

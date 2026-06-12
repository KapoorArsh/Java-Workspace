package oops;

class Inheritance {
	void run() {
		System.out.println("running");
	}
}
class Bye extends Inheritance{
	void tata() {
		System.out.println("nike");
	}
}
class Cat extends Bye{
	void meow() {
		System.out.println("hello");
	}
	public static void main(String [] args) {
		Cat m = new Cat();
		m.run();
		m.meow();
		m.tata();
	}
}

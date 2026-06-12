package oops;
class A9{
	interface Message{
		void msg();
	}
}
public class ClassNestedInterface implements A9.Message {
	public void msg() {
		System.out.println("Hello Nested Interface");
	}
	public static void main(String[] args) {
		A9.Message m1 = new ClassNestedInterface();
		m1.msg();
	}
}


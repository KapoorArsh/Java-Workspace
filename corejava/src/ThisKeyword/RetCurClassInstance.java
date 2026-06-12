package ThisKeyword;
class Demo2{
	Demo2 getA(){
		return this;
	}
	void ret() {
		System.out.println("Hello");
	}
}

public class RetCurClassInstance {
public static void main(String[] args) {
	new Demo2().getA().ret();
}
}

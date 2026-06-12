package oops;
interface A4{
	void fa();
}
interface B extends A4{
	void fb();
}
class XYZ implements B{
	public void fa() {
		System.out.println("XYZ:fa");
	}
	public void fb() {
		System.out.println("XYZ:fa");
	}
}
public class ExtendedInterface{
	public static void main(String []args) {
		XYZ obj = new XYZ();
		obj.fa();
		obj.fb();
	}
}


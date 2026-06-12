package Super;
class Supervar{
	int a = 7;
}
public class SuperVariable extends Supervar {
	void add1() {
		{
		int b = 10;
		System.out.println(b);
		System.out.println(super.a);
		}
	}
	public static void main(String[] args) {
	SuperVariable d = new SuperVariable();
	d.add1();
}
}

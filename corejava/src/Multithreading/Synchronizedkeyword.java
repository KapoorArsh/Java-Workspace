package Multithreading;

class printing{
	synchronized void print(char ch) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
class A extends Thread{
	printing p;
	A(printing p){
		this.p=p;
	}
	public void run() {
		p.print('#');
	} 
}
class B extends Thread{
	printing p;
	B(printing p){
		this.p = p;
	}
	public void run() {
		p.print('*');
	}
}
public class Synchronizedkeyword {
	public static void main(String[] args) {
		printing aa = new printing();
		A threadA = new A(aa);
		B threadB = new B(aa);
		threadA.start();
		threadB.start();
	}
}

package oops;
interface tata{
	void pehla();
	void doosra();
}
public class Zaza implements tata {
	public void pehla(){
		System.out.println("pehla");
	}
	public void doosra() {
		System.out.println("Doosra");
	}
	public static void main(String [] args) {
		Zaza obj = new Zaza();
		obj.pehla();
		obj.doosra();
	}
}

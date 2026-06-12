package ThisKeyword;
class Asargmethod  {
	void run(Asargmethod  obj) {
		System.out.println("Method invoked");
	}
	void add() {
		run(this);
	}

public static void main(String[] args) {
	Asargmethod a1=new Asargmethod();
	a1.add();
}
}

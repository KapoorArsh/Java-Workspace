package ThisKeyword;
class AsargConst{
	Demo1 obj;
	AsargConst(Demo1 obj){
		this.obj=obj;
	}
 void display() {
	 System.out.println(obj.x);
 }
}
class Demo1{
	int x=10;
	Demo1(){
		AsargConst a1=new AsargConst(this);
		a1.display();
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
	}
}


package corejava.Java9.features;

 interface Sayable {

  
    default void say() {  
        saySomething();  
    }
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}

public class Privatemethodinterface implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new Privatemethodinterface();  
        s.say();  
    }  
}  
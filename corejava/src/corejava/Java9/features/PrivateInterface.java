package corejava.Java9.features;
	interface Audiable{  
	    default void Bike() {  
	        Cars(); // Calling private method  
	        Horn(); //  Calling private static method  
	    }  
	    // Private method inside interface  
	    private void Cars() {  
	        System.out.println("Hello... I'm private method");  
	    }  
	    // Private static method inside interface  
	    private static void Horn() {  
	        System.out.println("I'm private static method");  
	    }  
	}  
	public class PrivateInterface implements Audiable {  
	    public static void main(String[] args) {  
	        Audiable s = new PrivateInterface();  
	        s.Bike();  
	    }  
	}  


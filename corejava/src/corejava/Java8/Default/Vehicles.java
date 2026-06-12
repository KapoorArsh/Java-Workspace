package corejava.Java8.Default;

public interface Vehicles {
public void stock();
 	default void turbo() {
 		System.out.println("Vroom...stu tu tu tu");
 	}
}

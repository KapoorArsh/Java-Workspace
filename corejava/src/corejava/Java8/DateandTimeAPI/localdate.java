package corejava.Java8.DateandTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class localdate {
	public static void main(String[] args) {
//		LocalDate localdate1 = LocalDate.from(LocalDate.now());
//		System.out.println(localdate1);
		LocalDate localdate2 = LocalDate.now();
		System.out.println(localdate2);
		LocalDate localdate4 = LocalDate.of(2021, Month.JANUARY, 18);
		System.out.println(localdate4);
	}
}

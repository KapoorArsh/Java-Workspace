package corejava.Java8.DateandTimeAPI;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class localtime {
	public static void main(String[] args) {
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		LocalTime localtime = LocalTime.from(LocalTime.now());
		System.out.println(localtime);
		LocalTime localtime1 = LocalTime.now();
		System.out.println(localtime1);
		LocalTime localtime2 = LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localtime2);
		LocalTime localtime3 = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println(localtime3);
		LocalTime localtime4 = LocalTime.of(04, 45);
		System.out.println(localtime4);
	}
}

package corejava.Java8.DateandTimeAPI;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Localdatetime1 {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);
		
		LocalDateTime dt1 = LocalDateTime.from(LocalDateTime.now());
		System.out.println(dt1);
		
		LocalDateTime dt2 = LocalDateTime.now();
		System.out.println(dt2);
		
		LocalDateTime dt3 = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(dt3);
		
		LocalDateTime dt4 = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println(dt4);
}
}

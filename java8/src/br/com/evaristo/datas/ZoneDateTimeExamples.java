/**
 * 
 */
package br.com.evaristo.datas;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author evari
 *
 */
public class ZoneDateTimeExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("ZonedDateTime = "+zonedDateTime);
		
		System.out.println("ZoneOffSet = "+zonedDateTime.getOffset());
		
		System.out.println("ZoneId = "+zonedDateTime.getZone());
		
		//System.out.println(ZoneId.getAvailableZoneIds());
		
		ZoneId.getAvailableZoneIds()
			.stream()
			.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("No Zones = "+ZoneId.getAvailableZoneIds().size());
		
		//CST , EST , MST, PST
		
		System.out.println("Chicago CST = "+ ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit EST = "+ ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("LA EST = "+ ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Denver MST= "+ ZonedDateTime.now(ZoneId.of("America/Denver")));
		
		System.out.println("ZonedDateTime using clock= "+ ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
		System.out.println("LocalDateTime with Zone Id ="+localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
		System.out.println("LocalDateTime with Clock ="+ localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("LocalDateTime ofInstant = "+localDateTime2);

		
		//Converting from LocalDateTime, Instant to ZonedLocalDate and Time
		
		LocalDateTime localDateTime3 = LocalDateTime.now();
		System.out.println("localDateTime3 "+ localDateTime3);
		
		ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("America/Detroit"));
		System.out.println("zonedDateTime of LocalDateTime = "+zonedDateTime1);
		
		ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Denver"));
		System.out.println("ZonedDateTime of Intant = "+ zonedDateTime2);
		
		OffsetDateTime offSetDateTime = LocalDateTime.now().atOffset(ZoneOffset.ofHours(-6));
		System.out.println("OffsetDateTime from LocalDateTime ="+offSetDateTime);
		
	}

}

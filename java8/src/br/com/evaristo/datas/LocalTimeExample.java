/**
 * 
 */
package br.com.evaristo.datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author evari
 *
 */
public class LocalTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime = " + localTime);
		
		LocalTime localTime1 = LocalTime.of(23, 33);
		System.out.println("LocalTime1 = " + localTime1);

		LocalTime localTime2 = LocalTime.of(23, 33, 45);
		System.out.println("LocalTime2 = " + localTime2);
		
		LocalTime localTime3 = LocalTime.of(23, 33, 53, 10);
		System.out.println("LocalTime3 = " + localTime3);
		
		/**
		 * Getting the values from LocalTime
		 */
		System.out.println("\nGetting the values from LocalTime");
		System.out.println("getHour = "+localTime.getHour());
		System.out.println("getMinutes = "+localTime.getMinute());
		System.out.println("getSecond = "+localTime.getSecond());
		System.out.println("getNano = "+localTime.getNano());
		System.out.println("CLOCK_HOUR_OF_AMPM = "+localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		System.out.println("toSecondOfDay = "+localTime.toSecondOfDay());
		System.out.println("toNanoOfDay = "+localTime.toNanoOfDay());// Represent the time in seconds
		
		/**
		 * Modifying values of LocaTime
		 */

		System.out.println("\nModifying values of LocaTime");
		
		System.out.println("minusHour = "+ localTime.minusHours(2));
		System.out.println("minusMinutes = "+ localTime.minusMinutes(30));
		System.out.println("minusSeconds = "+ localTime.minusSeconds(300));
		System.out.println("minusMinute = "+ localTime.minusMinutes(30));
		System.out.println("minusNanos = "+ localTime.minusNanos(800000));
		System.out.println("ChronoUnit.MINUTES = "+ localTime.minus(30,ChronoUnit.MINUTES));
		
		System.out.println("with LocalTime.MIDNIGHT = "+ localTime.with(LocalTime.MIDNIGHT));
		System.out.println("with ChronoField.MINUTE_OF_DAY = "+ localTime.with(ChronoField.MINUTE_OF_DAY,55));
		System.out.println("withHour = "+ localTime.withHour(10));
		System.out.println("withHour = "+ localTime.withMinute(44));
		System.out.println("withSecond = "+ localTime.withSecond(44));
		System.out.println("withNano = "+ localTime.withNano(5555555));

		System.out.println("plusHour = "+ localTime.plusHours(10));
		System.out.println("plusMinutes = "+ localTime.plusMinutes(35));
		System.out.println("plusSeconds = "+ localTime.plusSeconds(40));
		System.out.println("plusNano = "+ localTime.plusNanos(555));
		System.out.println("plus  = "+ localTime.plus(55, ChronoUnit.HOURS));
        System.out.println("plus = "+localTime.plus(Duration.ofHours(10)));


        /**
         * Additional Support methods 
         */
        
        System.out.println("\nAdditional Support methods ");
        System.out.println("Equals = "+localTime + " = "+localTime1+" "+ localTime.equals(localTime1));
        System.out.println("IsBefore = "+localTime + " = "+localTime1+" "+ localTime.isBefore(localTime1));
        System.out.println("IsAfter = "+localTime + " = "+localTime1+" "+ localTime.isAfter(localTime1));
        System.out.println("IsSupported = "+localTime.isSupported(ChronoField.ALIGNED_WEEK_OF_MONTH));

		
	


		
		
		
	}

}

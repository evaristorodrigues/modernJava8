/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author evari
 *
 */
public class LocalDateTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime = "+localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(2018, 12,10,23,45,35,12);
		System.out.println("LocalDateTime1 =" +localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(25, Month.FEBRUARY, 12, 13, 3, 5, 2);
		System.out.println("LocalDateTime2 =" +localDateTime2);
		
		LocalDateTime localDateTime3 = LocalDateTime.of(2020, 10, 10, 10, 10, 10);
		System.out.println("localDateTime3 =" +localDateTime3);

		LocalDateTime localDateTime4 = LocalDateTime.of(2020, 10, 10, 10, 10);
		System.out.println("localDateTime4 =" +localDateTime4);
		
		LocalDateTime localDateTime5 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime5 =" +localDateTime5);
		
		/**
		 * Getting the time and date from LocalDateTime instance
		 */
		System.out.println("\nGetting the time and date from LocalDateTime instance");
		System.out.println("hour ="+ localDateTime.getHour());
		System.out.println("minute ="+ localDateTime.getMinute());
		System.out.println("second ="+ localDateTime.getSecond());
		System.out.println("nano ="+ localDateTime.getNano());
		System.out.println("getDayOfMonth ="+ localDateTime.getDayOfMonth());
		System.out.println("getDayOfYear ="+ localDateTime.getDayOfYear());
		System.out.println("getDayOfWeek ="+ localDateTime.getDayOfWeek());
		System.out.println("getMonth ="+ localDateTime.getMonth());
		System.out.println("getMonthValue ="+ localDateTime.getMonthValue());
		System.out.println("getYear ="+ localDateTime.getYear());
		System.out.println("SECOND_OF_DAY =" + localDateTime.get(ChronoField.SECOND_OF_DAY));
		
		/*
		 * Modifying LocalDateTime
		 */
		
		System.out.println("\nModifying LocalDateTime");
		
		System.out.println("plusDays ="+localDateTime.plusDays(1));
		System.out.println("plusHours ="+localDateTime.plusHours(1));
		System.out.println("plusMinutes ="+localDateTime.plusMinutes(1));
		System.out.println("plusSeconds ="+localDateTime.plusSeconds(1));
		System.out.println("plusSeconds ="+localDateTime.plusNanos(1));
		System.out.println("plusDays ="+localDateTime.plusDays(10));
		System.out.println("plusWeeks ="+localDateTime.plusWeeks(10));
		System.out.println("plusMonths ="+localDateTime.plusMonths(10));
		System.out.println("plusYears ="+localDateTime.plusYears(10));
		System.out.println("plus ChronoUnit.CENTURIES ="+localDateTime.plus(10, ChronoUnit.CENTURIES));
		
		System.out.println("minusDays ="+localDateTime.minusDays(1));
		System.out.println("minusHours ="+localDateTime.minusHours(1));
		System.out.println("minusMinutes ="+localDateTime.minusMinutes(1));
		System.out.println("minusSeconds ="+localDateTime.minusSeconds(1));
		System.out.println("minusSeconds ="+localDateTime.minusNanos(1));
		System.out.println("minusDays ="+localDateTime.minusDays(10));
		System.out.println("minusWeeks ="+localDateTime.minusWeeks(10));
		System.out.println("minusMonths ="+localDateTime.minusMonths(10));
		System.out.println("minusYears ="+localDateTime.minusYears(10));
		System.out.println("minus ChronoUnit.CENTURIES ="+localDateTime.minus(10, ChronoUnit.CENTURIES));

		System.out.println("withDayOfMonth ="+localDateTime.withDayOfMonth(10));
		System.out.println("withDayOfYear ="+localDateTime.withDayOfYear(10));
		System.out.println("withHour ="+localDateTime.withHour(1));
		System.out.println("withMinute ="+localDateTime.withMinute(1));
		System.out.println("withSecond ="+localDateTime.withSecond(1));
		System.out.println("withNano ="+localDateTime.withNano(1));
		System.out.println("withMonth ="+localDateTime.withMonth(10));
		System.out.println("withYear ="+localDateTime.withYear(10));
		System.out.println("with ChronoField.AMPM_OF_DAY ="+localDateTime.with(ChronoField.AMPM_OF_DAY,1));
		
		//Converting localdate, localtime to localdatetime and viceversa
		System.out.println("\nConverting localdate, localtime to localdatetime and viceversa");
		LocalDate localDate = LocalDate.now();
		System.out.println("atTime = "+localDate.atTime(22, 12,26, 87740));
		
		LocalTime localTime = LocalTime.now();
		System.out.println("atDate = " + localTime.atDate(localDate));
		
		LocalDateTime localDateTime6 = localTime.atDate(localDate);
		System.out.println("toLocalDate = "+localDateTime6.toLocalDate());
		System.out.println("toLocalTime = "+localDateTime6.toLocalTime());
		

	}

}

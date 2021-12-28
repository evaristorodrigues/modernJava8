/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @author evari
 *
 */
public class LocalDateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	  System.out.println("Initialize LocalDate");	
      LocalDate localDate = LocalDate.now();      
      System.out.println("LocalDate.now() = "+ localDate);
      
      LocalDate localDate1 = LocalDate.of(2021, 10, 26);
      System.out.println("LocalDate.of(,,) = "+ localDate1);
      
      LocalDate localDate2 = LocalDate.ofYearDay(2021, 32);
      System.out.println("LocalDate.ofYearDay() = "+localDate2);
      
      /**
       * 
       * Getting values from localDate
       */
      
      System.out.println("\nGetting values from localDate");
      
      System.out.println("GetMonth = "+ localDate.getMonth());
      System.out.println("GetMonthValue = "+ localDate.getMonthValue());
      System.out.println("GetYear = "+ localDate.getYear());       
      System.out.println("GetDayOfWeek = "+ localDate.getDayOfWeek());
      System.out.println("GetDayOfYear = "+ localDate.getDayOfYear());
      System.out.println("GetDayOfMonth = "+ localDate.getDayOfMonth());
      
      System.out.println("Get Day of Month using LocalDate.get() = "+ localDate.get(ChronoField.DAY_OF_MONTH));

      /**
       * Modifying LocalDate
       */
      
      System.out.println("\nModifying  localDate");

      
      System.out.println("PlusDays = "+ localDate.plusDays(10));
      System.out.println("PlusWeeks = " + localDate.plusWeeks(3));
      System.out.println("PlusMonths = "+ localDate.plusMonths(1));
      System.out.println("PlusYears = "+ localDate.plusYears(1));
      System.out.println("Plus ChronoUnit.DAYS = "+ localDate.plus(10,ChronoUnit.DAYS));
      
      System.out.println("MinusDays = "+ localDate.minusDays(10));
      System.out.println("MinusWeeks = "+ localDate.minusWeeks(4));
      System.out.println("MinusMonths = "+ localDate.minusMonths(4));
      System.out.println("MinusMonths = "+ localDate.minusYears(4)); 
      System.out.println("Minus ChronoUnit.DECADES = "+ localDate.minus(2, ChronoUnit.DECADES));
      
      
      System.out.println("WithDayOfYear = "+ localDate.withDayOfYear(10));
      System.out.println("WithDayOfYear = "+ localDate.withDayOfMonth(31));
      System.out.println("WithMonth = "+ localDate.withMonth(10));
      System.out.println("WithYear = "+ localDate.withYear(2222));
      
      System.out.println("With ChronoField = "+ localDate.with(ChronoField.DAY_OF_WEEK, 4));
      System.out.println("With TemporalAdjusters firstDayOfNextYear = "+ localDate.with(TemporalAdjusters.firstDayOfNextYear()));


      /**
       * Additional Support methods 
       */      

      System.out.println("\nAdditional Support methods ");
      System.out.println("Is LeapYear = "+ LocalDate.ofYearDay(2021,01).isLeapYear());      
      System.out.println("IsEquals = "+localDate + " = "+localDate1+" "+ localDate.isEqual(localDate1));
      System.out.println("IsBefore = "+localDate + " = "+localDate1+" "+ localDate.isBefore(localDate1));
      System.out.println("IsAfter = "+localDate + " = "+localDate1+" "+ localDate.isAfter(localDate1));
      System.out.println("IsSupported = "+localDate.isSupported(ChronoField.ALIGNED_WEEK_OF_MONTH));

      /**
       * Unsupported  
       */
      
      System.out.println("\nUnsupported ");
      System.out.println("ChronicUnit minus (localDate.minus(1, ChronoUnit.MINUTES)) "+ localDate.minus(1, ChronoUnit.MINUTES));








	}

}

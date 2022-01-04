/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author evari
 *
 */
public class ComparingDatesPeriodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2018, 01, 01);
		LocalDate localDate1 = LocalDate.of(2018, 12, 31);
		
		/*
		 * 
		 */

		Period period = localDate.until(localDate1);
		System.out.println("getDays = " +period.getDays()); // result is 31 - 1
		System.out.println("getMonths = " +period.getMonths());// result is 12 -1
		System.out.println("getYears = " +period.getYears());// result is 2018 - 2018
		
		Period period1 = Period.ofDays(10);
		System.out.println("period1.getDays() =" + period1.getDays());
		
		Period period2 = Period.ofYears(10);
		System.out.println("getYears() = " + period2.getDays());
		System.out.println("toTotalMonths =" + period2.toTotalMonths());
		
		Period period3 = Period.between(localDate, localDate1);
		System.out.println("Period between "+localDate + " and "+localDate1 +" is "
		+ period3.getDays() + " Days, "+ period3.getMonths()+ " Months and  "+period3.getYears() +" Years");


		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime1 = LocalDateTime.now().plusDays(10);
		
		Period period4 = Period.between(localDateTime.toLocalDate(), localDateTime1.toLocalDate());
		System.out.println("Period " + period4.getDays());
	}

}

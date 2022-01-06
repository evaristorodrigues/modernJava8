/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author evari
 *
 */
public class FormattingLocalDateExample {

	/**
	 * @param args
	 */
	
	public static void parseLocalDate() {
		/**
		 * String to a LocalDate
		 */
		
		String date = "2018-04-28";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("LocalDate.parse = "+localDate);
		
		LocalDate locaDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("LocalDate.parse DateTimeFormatter.ISO_LOCAL_DATE  = "+locaDate1);
		
		String date1 = "20180428";
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("LocalDate.parse DateTimeFormatter.BASIC_ISO_DATE  = "+localDate2);	
		
		/**
		 * Custom defined dateformat
		 */
		String date2 = "2018|04|28";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate3 = LocalDate.parse(date2,dateTimeFormatter);
		System.out.println("LocalDate.parse ofPattern(\"yyyy|MM|dd\") = "+localDate3);
		
		String date3 = "2018*04*28";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate localDate4 = LocalDate.parse(date3,dateTimeFormatter1);
		System.out.println("LocalDate.parse ofPattern(\"yyyy*MM*dd\") = "+localDate4);

		
	}
	public static void formatLocalDate() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy=MM=dd");
		String dateFormatted = LocalDate.now().format(dateTimeFormatter);
		System.out.println("Date Formatted = "+dateFormatted);
		
	}	
	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}

}

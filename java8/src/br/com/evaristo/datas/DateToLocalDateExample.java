/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author evari
 *
 */
public class DateToLocalDateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//java.util.date to LocalDate and vice versa
		
		Date date = new Date();
		System.out.println("Date = "+date);
		
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("LocalDate from Date = "+localDate);
		
		new Date();
		Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Date from LocalDate ="+ date1);
		
		// java.sql.date to LocalDate and vice versa
		
		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
		System.out.println("java.sql.Date from LocalDate = "+sqlDate);
		
		LocalDate localDate2 = sqlDate.toLocalDate();
		System.out.println("LocalDate from java.sql.Date = "+localDate2);
	}

}

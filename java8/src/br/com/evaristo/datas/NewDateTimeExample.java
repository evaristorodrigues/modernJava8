/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author evari
 *
 */
public class NewDateTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//LocaDatel
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		//LocalTime
		LocalTime  localTime = LocalTime.now();
		System.out.println(localTime);
		//LocalDateTime
		LocalDateTime  localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

	}

}

/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author evari
 *
 */
public class FormattingLocalTimeExamples {

	/**
	 * @param args
	 */
	
	public static void parseDateTime() {
		String time = "10:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("LocalTime parse = "+localTime);
		
		LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("LocalTime parse = "+localTime1);
		
		/**
		 * Custom defined format
		 */
		
		String time1 = "10*00";
		DateTimeFormatter  dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
		System.out.println("LocalTime.parseofPattern(\"HH*mm\"); "+localTime2);
		
		String time2 = "10*00*01";
		DateTimeFormatter  dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime3 = LocalTime.parse(time2, dateTimeFormatter1);
		System.out.println("LocalTime.parse ofPattern(\"HH*mm*ss\"); "+localTime3);		
	}
	
	public static void formatDateTime() {
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime = "+localTime);
		DateTimeFormatter  dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
		String timeFormatted = localTime.format(dateTimeFormatter);
		System.out.println("Time Formatted = "+ timeFormatted);

	}
	public static void main(String[] args) {
		parseDateTime();
		formatDateTime();
	}

}

/**
 * 
 */
package br.com.evaristo.datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author evari
 *
 */
public class FormattingLocalDateTimeExample {

	/**
	 * @param args
	 */
	
	public static void parseLocalDateTime() {
		String DateTime = "2018-04-18T14:33:33";
		LocalDateTime localDateTime = LocalDateTime.parse(DateTime);
		System.out.println("LocalDateTime.parse = "+localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.parse(DateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("LocalDateTime.parse DateTimeFormatter.ISO_LOCAL_DATE_TIME = "+localDateTime1);
		
		/**
		 * Custom format
		 */
		String DateTime2 = "2018-04-18T14|33|33";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(DateTime2,dateTimeFormatter1);
		System.out.println("LocalDateTime.parse ofPattern(\"yyyy-MM-dd'T'HH|mm|ss\") = "+localDateTime2);
		
		String DateTime3 = "2018-04-18abc14|33|33";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime localDateTime3 = LocalDateTime.parse(DateTime3,dateTimeFormatter2);
		System.out.println("LocalDateTime.parse ofPattern(\"yyyy-MM-dd'abc'HH|mm|ss\") = "+localDateTime3);
		
	}
	public static void formatLocalDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime = "+localDateTime);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String localDateTimeFormatted = localDateTime.format(dateTimeFormatter);
		System.out.println("localDateTime Formatted = "+ localDateTimeFormatted);
	}
	public static void main(String[] args) {
		parseLocalDateTime();
		formatLocalDateTime();
	}

}

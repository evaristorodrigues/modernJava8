/**
 * 
 */
package br.com.evaristo.datas;

import java.time.Duration;
import java.time.Instant;

/**
 * @author evari
 *
 */
public class InstantExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		//Jan 1st 1970 -> Epoch -> 8600 second = day
		System.out.println(instant.getEpochSecond());
		
		System.out.println(Instant.ofEpochSecond(0));
		
		Instant instant1 = Instant.now();
		
		Duration duration = Duration.between(instant, instant1);
		System.out.println("difference = "+duration.getNano());
	}

}

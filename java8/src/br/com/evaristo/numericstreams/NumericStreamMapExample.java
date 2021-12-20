/**
 * 
 */
package br.com.evaristo.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author evari
 *
 */
public class NumericStreamMapExample {

	/**
	 * @param args
	 */
	
	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(0, 10)
				//.mapToObj((i) -> i)
				.mapToObj((i) -> {
					return new Integer(i);
				})
				.collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(0, 10)
				.mapToLong((i)-> i)
				.sum();
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(0, 10)
				.mapToLong((i)-> i)
				.sum();
	}
	public static void main(String[] args) {
	     System.out.println(mapToObject());
	     System.out.println(mapToLong());
	     System.out.println(mapToDouble());


	}

}

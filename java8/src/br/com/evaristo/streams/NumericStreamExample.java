/**
 * 
 */
package br.com.evaristo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author evari
 *
 */
public class NumericStreamExample {

	/**
	 * @param args
	 */
	
	public static int sumOfNumbers(List<Integer> integerList) {
		return integerList.stream()
				.reduce(0, (x,y) -> x+y);
	}
	
	public static int sumOfNumberIntStream() {
		return IntStream.rangeClosed(1, 6).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Result of sumOfNumbers= "+sumOfNumbers(integerList));
		System.out.println("Result of sumOfNumbers= "+sumOfNumberIntStream());
	}

}

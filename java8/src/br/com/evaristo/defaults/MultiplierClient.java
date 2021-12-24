/**
 * 
 */
package br.com.evaristo.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author evari
 *
 */
public class MultiplierClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integerList = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		Multiplier multiplier = new MultiplierImpl();
		System.out.println("Before Java 8 result is = "+ multiplier.multiply(integerList));
		System.out.println("Default Method result is = "+ multiplier.size(integerList));
		System.out.println("Static Method result is = "+ Multiplier.isEmpty(integerList));
		

	}

}

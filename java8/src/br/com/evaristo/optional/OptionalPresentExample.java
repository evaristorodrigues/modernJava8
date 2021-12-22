/**
 * 
 */
package br.com.evaristo.optional;

import java.util.Optional;

/**
 * @author evari
 *
 */
public class OptionalPresentExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Optional<String> stringOptional = Optional.ofNullable("Camila");
		System.out.println(stringOptional.isPresent());
		if(stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		}
		
		stringOptional.ifPresent(System.out::println);
	}

}

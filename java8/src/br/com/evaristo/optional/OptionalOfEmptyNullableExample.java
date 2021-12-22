/**
 * 
 */
package br.com.evaristo.optional;

import java.util.Optional;

/**
 * @author evari
 *
 */
public class OptionalOfEmptyNullableExample {

	/**
	 * @param args
	 */
	
	public static Optional<String> ofNullable(){
		Optional<String> stringOptional = Optional.ofNullable("Hello");
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptional = Optional.of("Hello");
		return stringOptional;
	}
	
	public static Optional<String> empty(){
		return Optional.empty();
	}
	
	
	public static void main(String[] args) {
		System.out.println("OfNullable: "+ofNullable());
		System.out.println("Of: "+of());
		System.out.println("Empty: "+empty());


	}

}

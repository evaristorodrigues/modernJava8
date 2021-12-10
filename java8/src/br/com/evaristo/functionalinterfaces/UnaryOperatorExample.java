/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.function.UnaryOperator;

/**
 * @author evari
 *
 */
public class UnaryOperatorExample {

	/**
	 * @param args
	 */
	
	static UnaryOperator<String> unaryOperator = (s) -> s.concat("Linda");
	
	public static void main(String[] args) {
       System.out.println(unaryOperator.apply("Camila"));
	}

}

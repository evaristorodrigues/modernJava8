/**
 * 
 */
package br.com.evaristo.methodreference;

import java.util.function.Function;

/**
 * @author evari
 *
 */
public class FunctionMethodReferenceExample {

	/**
	 * @param args
	 */

	static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
	static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda.apply("Java"));
		System.out.println(toUpperCaseMethodReference.apply("Java"));

	}

}

/**
 * 
 */
package br.com.evaristo.imperatvedeclarative;

import java.util.stream.IntStream;

/**
 * @author evaristosrodrigues
 *
 */
public class ImperativeVSDeclarativeExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Imperative - How style of programming 
		 */
		
		int sum =0;
		for(int i =0; i <=100; i++) {
			sum+=i;
		}
		
		System.out.println("Sum using Imperative Approach : "+sum);
		
		/**
		 * Declarative Style of Programming - What Style of programming
		 */
		
		int sum1= IntStream.rangeClosed(0, 100)
				  .parallel()
				  .sum();
		
		System.out.println("Sum using Declarative Approach : "+sum1);

	}

}

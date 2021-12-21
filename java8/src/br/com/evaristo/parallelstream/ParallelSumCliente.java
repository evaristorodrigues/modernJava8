/**
 * 
 */
package br.com.evaristo.parallelstream;

import java.util.stream.IntStream;

/**
 * @author evari
 *
 */
public class ParallelSumCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sum sum = new Sum();
		
		IntStream.rangeClosed(1,1000)
		.parallel()
		.forEach(sum::performSum);
		
		System.out.println(sum.getTotal());
	}

}

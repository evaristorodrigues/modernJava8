/**
 * 
 */
package br.com.evaristo.defaults;

import java.util.List;

/**
 * @author evari
 *
 */
public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> studentList) {
		return studentList.stream().reduce(1,(a,b) -> a * b);
	}
	@Override
	public int size(List<Integer> integers) {
		System.out.println("Inside the class MultiplierImpl");
		return integers.size();
		
	}
	

	/**
	 * @param args
	 */


}

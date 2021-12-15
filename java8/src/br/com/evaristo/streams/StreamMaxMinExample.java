/**
 * 
 */
package br.com.evaristo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author evari
 *
 */
public class StreamMaxMinExample {

	/**
	 * @param args
	 */
	
	public static Integer findMaxValue(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, (a,b) -> a > b ? a : b);
	}
	public static Optional<Integer> findMaxValueOptional(List<Integer> numbers) {
		return numbers.stream()
				.reduce( (a,b) -> a > b ? a : b);
	}
	public static Optional<Integer> findMinValueOptional(List<Integer> numbers) {
		return numbers.stream()
				.reduce( (a,b) -> a < b ? a : b);
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,6,7,8,9,10,11);
		System.out.println("Max value =" + findMaxValue(numbers));
		
		Optional<Integer> maxOp = findMaxValueOptional(numbers);
		if(maxOp.isPresent()) {
			System.out.println("Max Value with Optional= " + maxOp.get());
		}else {
			System.out.println("Empty");
		}
		
		Optional<Integer> minOp = findMinValueOptional(numbers);
		if(maxOp.isPresent()) {
			System.out.println("Min Value with Optional= " + minOp.get());
		}else {
			System.out.println("Empty");
		}
	}

}

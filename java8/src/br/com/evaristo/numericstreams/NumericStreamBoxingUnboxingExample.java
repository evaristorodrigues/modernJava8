/**
 * 
 */
package br.com.evaristo.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author evari
 *
 */
public class NumericStreamBoxingUnboxingExample {

	/**
	 * @param args
	 */
	
	public static List<Integer> boxing(){
		return IntStream.rangeClosed(0,10) // Int Stream
				.boxed() //Integer Stream
				.collect(Collectors.toList()); //List<Integer>
	}
	
	public static int unboxing(List<Integer> integerList) {
		return integerList.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}
	
	public static void main(String[] args) {
     List<Integer> integerList = boxing();
     System.out.println("Boxing ="+ integerList);
     System.out.println("Unboxing = "+ unboxing(integerList));
	}

}

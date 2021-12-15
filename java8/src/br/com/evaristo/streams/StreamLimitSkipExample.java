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
public class StreamLimitSkipExample {

	/**
	 * @param args
	 */
	
	public static Optional<Integer> skip(List<Integer> numbers){
		return numbers.stream()
				.skip(3)//4,5,6,7,8,9,10
				.reduce((a,b) -> a+b);
	}
	public static Optional<Integer> limit(List<Integer> numbers){
		return numbers.stream()
				.limit(3) // 1,2,3
				.reduce((a,b) -> a+b);
	}
	public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     Optional<Integer> skipResult = skip(numbers);
     if(skipResult.isPresent()) {
    	 System.out.println("Skip result= "+skipResult.get());
     }else {
    	 System.out.println("Empty");
     }
     
     Optional<Integer> limOptional = limit(numbers);
     if(limOptional.isPresent()) {
    	 System.out.println("Limit result= "+limOptional.get());
     }else {
    	 System.out.println("Empty");    	 
     }     
     
	}

}

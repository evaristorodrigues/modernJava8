/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author evari
 *
 */
public class BinaryOperatorExample {

	/**
	 * @param args
	 */
	
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b); 
	
	public static void main(String[] args) {
		
      BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
      System.out.println(binaryOperator.apply(5, 3));
      
      BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
      System.out.println("minBy 5, 6 =" + minBy.apply(5, 6));
      
      BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
      System.out.println("maxBy 5, 6 =" + maxBy.apply(5,6));
      
	}

}

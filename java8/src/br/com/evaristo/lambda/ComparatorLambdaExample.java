/**
 * 
 */
package br.com.evaristo.lambda;

import java.util.Comparator;

/**
 * @author evari
 *
 */
public class ComparatorLambdaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Priot to java 8
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
        System.out.println("Comparing with java 7 "+ comparator.compare(3, 2));
		//Lambda
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		
        System.out.println("Comparing with java 8 Lambda "+ comparatorLambda.compare(3, 2));

		Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) -> a.compareTo(b);
		
        System.out.println("Comparing with java 8 Lambda without type "+ comparatorLambda1.compare(3, 2));

				
		

	}
}

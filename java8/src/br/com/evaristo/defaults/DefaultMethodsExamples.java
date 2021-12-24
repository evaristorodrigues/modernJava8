/**
 * 
 */
package br.com.evaristo.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author evari
 *
 */
public class DefaultMethodsExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Sort the list names in alphabetical order
		 */
		
		List<String> stringList = Arrays.asList("Adam", "Jenny", "Aex", "Dan", "mike", "Erik");
		
		
		/*
		 * Prior to Java 8
		 */

		//Collections.sort(stringList);
		
		System.out.println("Sorted list using Collections.Sort() :"+ stringList);
		
		/*
		 * Java 
		 */
		
		stringList.sort(Comparator.naturalOrder());		
		System.out.println("Sorted list using List.Sort() :"+ stringList);
		
		stringList.sort(Comparator.reverseOrder());
		System.out.println("Sorted list using List.Sort() reverse :"+ stringList);



	}

}

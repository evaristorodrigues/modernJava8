/**
 * 
 */
package br.com.evaristo.lambda;

import java.util.function.Consumer;

/**
 * @author evari
 *
 */
public class LambdaVariableExample2 {

	/**
	 * @param args
	 */
	
	static int i = 5;
	public static void main(String[] args) {

		i++;
		
		Consumer<Integer> consumer = (i2) ->{
			i++;
			System.out.println(i+i2);
		};
		
		consumer.accept(4);
		
	}

}

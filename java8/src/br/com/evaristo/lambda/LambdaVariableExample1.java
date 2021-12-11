/**
 * 
 */
package br.com.evaristo.lambda;

import java.util.function.Consumer;

/**
 * @author evari
 *
 */
public class LambdaVariableExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int i =5;
		
		Consumer<Integer> consumer = (i2) ->{
	        //i++; --> cannot manipulate de value of an local variable inside a lambda scope
			System.out.println(i+i2);
		};
		//i++; we cannot manipulate de value of a local variable that will be used inside a lambda scope
		consumer.accept(4);

	}

}

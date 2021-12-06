/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

/**
 * @author evari
 *
 */
public class FunctionExample2 {

    public static String performaConcat(String str) {
    	return FunctionExample.addSomething.apply(str);
    }
	public static void main(String[] args) {
		String result = performaConcat("Hello");
		System.out.println("Result is : "+result);
	}

}

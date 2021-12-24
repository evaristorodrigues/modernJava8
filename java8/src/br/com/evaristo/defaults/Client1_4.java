/**
 * 
 */
package br.com.evaristo.defaults;

/**
 * @author evari
 *
 */
public class Client1_4 implements Interface1, Interface4 {

	/**
	 * @param args
	 */

	@Override
	public void methodA() {
		//Interface1.super.methodA();
		System.out.println("Inside Method A "+ this.getClass());
	}
	
	public static void main(String[] args) {
		Client1_4 client1_4 = new Client1_4();
		
		client1_4.methodA();
	}

}

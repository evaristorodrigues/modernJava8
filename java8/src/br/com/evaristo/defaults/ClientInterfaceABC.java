/**
 * 
 */
package br.com.evaristo.defaults;

/**
 * @author evari
 *
 */
public class ClientInterfaceABC implements Interface1, Interface2, Interface3{

	/**
	 * @param args
	 */
	// 1 - Class that implements the interface 
	// 2 - The sub interface that extends the interface
	
	public void methodA() {
		System.out.println("Insde method A "+ ClientInterfaceABC.class );
	}
	
	public static void main(String[] args) {
		ClientInterfaceABC clientInterfaceABC = new ClientInterfaceABC();
		clientInterfaceABC.methodA();
		clientInterfaceABC.methodB();
		clientInterfaceABC.methodC();
		
	}

}

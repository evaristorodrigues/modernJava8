/**
 * 
 */
package br.com.evaristo.parallelstream;

/**
 * @author evari
 *
 */
public class Sum {

	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	// It is not a thread-safe method - We will have probleam with parallel Stream
	public void performSum(int input) {
		total+=input;
	}
}

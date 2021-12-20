/**
 * 
 */
package br.com.evaristo.streamterminal;

import java.util.stream.Collectors;

import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamsCoutingExample {

	/**
	 * @param args
	 */
	
	public static long count() {
		return StudentDataBase.getAllStudents().stream()
				.filter((s) -> s.getGpa() >= 3.9)
				//.count();
				.collect(Collectors.counting());
	}
	public static void main(String[] args) {
		System.out.println(count());
	}

}

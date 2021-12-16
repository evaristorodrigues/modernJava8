/**
 * 
 */
package br.com.evaristo.streams;

import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamMatchExample {

	/**
	 * @param args
	 */
	
	public static Boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
				.allMatch((s) -> s.getGpa() >= 3.5);
	}
	
	public static Boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch((s) -> s.getGpa() >= 4.0);
	}
	public static Boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch((s) -> s.getGpa() >= 4.1);
	}
	public static void main(String[] args) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(anyMatch());


	}

}

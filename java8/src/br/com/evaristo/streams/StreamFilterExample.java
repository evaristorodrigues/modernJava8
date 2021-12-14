/**
 * 
 */
package br.com.evaristo.streams;

import java.util.stream.Collectors;

import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamFilterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().stream()
		.filter((s) -> s.getGender().equals("female"))
		.filter((s) -> s.getGpa() >= 3.9)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}

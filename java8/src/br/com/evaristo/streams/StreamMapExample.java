/**
 * 
 */
package br.com.evaristo.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamMapExample {

	/**
	 * @param args
	 */

	public static List<String> namesList() {
		List<String> studentList = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		return studentList;
	}

	public static Set<String> namesSet() {
		Set<String> studentList = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());

		return studentList;
	}

	public static void main(String[] args) {
		System.out.println(namesList());
		System.out.println("\n"+namesSet());

	}

}

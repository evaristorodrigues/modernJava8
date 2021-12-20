/**
 * 
 */
package br.com.evaristo.streamterminal;

import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamsJoiningExample {

	/**
	 * @param args
	 */
	
	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining());
				
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("-"));
				
	}
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));				
	}
	public static void main(String[] args) {
     System.out.println(joining_1());
     System.out.println(joining_2());
     System.out.println(joining_3());     
	}

}

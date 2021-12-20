/**
 * 
 */
package br.com.evaristo.streamterminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamsMappingExample {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		List<String> listString = StudentDataBase.getAllStudents().stream()
				                  .collect(Collectors.mapping(Student::getName, Collectors.toList()));

		Set<String> setString = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		
		System.out.println(listString);
		System.out.println(setString);


	}

}

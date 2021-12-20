/**
 * 
 */
package br.com.evaristo.streams;

import java.util.List;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamFlatMapExample {

	/**
	 * @param args
	 */
	
	public static List<String> printStudentActivities(){
		List<String> studentActivities= StudentDataBase.getAllStudents().stream()
				                        .map(Student::getActivities)    // Stateless     
				                        .flatMap(List::stream)  // Stateless 
				                        .distinct() //Stateful
				                        .sorted() //Stateful
				                        .collect(Collectors.toList());
		
		return studentActivities;
	}
	public static void main(String[] args) {
       System.out.println(printStudentActivities());
	}

}

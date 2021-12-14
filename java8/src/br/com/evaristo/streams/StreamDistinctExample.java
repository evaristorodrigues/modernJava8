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
public class StreamDistinctExample {

	/**
	 * @param args
	 */
	
	public static List<String> printStudentDistinctActivities(){
		List<String> studentActivities= StudentDataBase.getAllStudents().stream()
				                        .map(Student::getActivities)         
				                        .flatMap(List::stream)
				                        .distinct()
				                        .collect(Collectors.toList());
		
		return studentActivities;
	}
	public static void main(String[] args) {
       System.out.println(printStudentDistinctActivities());
	}

}

/**
 * 
 */
package br.com.evaristo.streams;

import java.util.List;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamCountExample {

	/**
	 * @param args
	 */
	
	public static Long printCountStudentDistinctActivities(){
		Long studentActivities= StudentDataBase.getAllStudents().stream()
				                        .map(Student::getActivities)         
				                        .flatMap(List::stream)
				                        .distinct()
				                        .count();
		
		return studentActivities;
	}
	public static void main(String[] args) {
       System.out.println(printCountStudentDistinctActivities());
	}

}

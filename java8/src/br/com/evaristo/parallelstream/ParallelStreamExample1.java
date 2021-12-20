/**
 * 
 */
package br.com.evaristo.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class ParallelStreamExample1 {

	/**
	 * @param args
	 */
	
	public static List<String> sequentialPrintStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> studentActivities= StudentDataBase.getAllStudents().stream()
				                        .map(Student::getActivities)    // Stateless     
				                        .flatMap(List::stream)  // Stateless 
				                        .distinct() //Stateful
				                        .sorted() //Stateful
				                        .collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential: "+(endTime - startTime));
		return studentActivities;
	}
	
	public static List<String> parallelPrintStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> studentActivities= StudentDataBase.getAllStudents()
										.stream()
										.parallel()
				                        .map(Student::getActivities)    // Stateless     
				                        .flatMap(List::stream)  // Stateless 
				                        .distinct() //Stateful
				                        .sorted() //Stateful
				                        .collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel: "+(endTime - startTime));
		return studentActivities;
	}
	
	public static void main(String[] args) {
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
	}

}

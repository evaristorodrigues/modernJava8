/**
 * 
 */
package br.com.evaristo;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Predicate<Student> gradeLevelPredicate = (s) -> s.getGradeLevel() >=3;
	Predicate<Student> gpaPredicate = (s) -> s.getGpa() >=3.9;
	
    Map<String, List<String>> mapStudent= StudentDataBase.getAllStudents().stream()
    		                        .filter(gradeLevelPredicate)
    		                        .filter(gpaPredicate)
    		                        .collect(Collectors.toMap(Student::getName, Student::getActivities));
    
    System.out.println(mapStudent);
    		              
		
		
	}

}

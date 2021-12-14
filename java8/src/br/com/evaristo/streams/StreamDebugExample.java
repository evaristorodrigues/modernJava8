/**
 * 
 */
package br.com.evaristo.streams;

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
public class StreamDebugExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Predicate<Student> gradeLevelPredicate = (s) -> s.getGradeLevel() >=3;
	Predicate<Student> gpaPredicate = (s) -> s.getGpa() >=3.9;
	
    Map<String, List<String>> mapStudent= StudentDataBase.getAllStudents().stream()
    		                        .peek((s) -> {System.out.println("Sem Filtrar= " +s);})
    		                        .filter(gradeLevelPredicate)
    		                        .peek((s) -> {System.out.println("Depois 1º Filtro= " +s);})    		                        
    		                        .filter(gpaPredicate)
    		                        .collect(Collectors.toMap(Student::getName, Student::getActivities));
    
    System.out.println("\nResultado map= "+mapStudent);
    		              
		
		
	}

}

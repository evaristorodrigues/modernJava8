/**
 * 
 */
package br.com.evaristo.streamterminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamsPartitioningByExample {

	/**
	 * @param args
	 * @return 
	 */
	
	public static Map<Boolean, List<Student>> partitioningBy_1() {
		Predicate<Student> studentPredicateGPA = s -> s.getGpa() >= 3.9;
		
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.partitioningBy(studentPredicateGPA));
	}
	
	public static Map<Boolean, Set<Student>> partitioningBy_2() {
		Predicate<Student> studentPredicateGPA = s -> s.getGpa() >= 3.9;
		
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.partitioningBy(studentPredicateGPA,
						 Collectors.toSet()));
	}
	
	public static void main(String[] args) {
		System.out.println("\n Simple Predicate: \n"+partitioningBy_1());
		System.out.println("\n Predicate + Collectorj : \n"+partitioningBy_2());
	}

}

/**
 * 
 */
package br.com.evaristo.optional;

import java.util.Optional;

import br.com.evaristo.data.Bike;
import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class OptionalMapFlatMapExample {

	/**
	 * @param args
	 */
	
	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		studentOptional
			.filter(s -> s.getGpa() >= 3.2)
			.ifPresent(System.out::println);
	}

	public static void optionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
        if(studentOptional.isPresent()) {
        	Optional<String> stringOptional = studentOptional
        										.filter(s -> s.getGpa() >= 3.2)
        										.map(Student::getName);
        	System.out.println(stringOptional.get());
        }
	}
	
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<String> stringOptional = studentOptional
			.filter(s -> s.getGpa() >= 3.5)
			.flatMap(Student::getBike)
			//.map(Student::getBike);
			.map(Bike::getName);
		
		stringOptional.ifPresent(System.out::println);
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}

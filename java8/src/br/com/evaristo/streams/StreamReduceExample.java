/**
 * 
 */
package br.com.evaristo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamReduceExample {

	/**
	 * @param args
	 */
	
	public static Integer performMultiplication(List<Integer> numbers) {
		return numbers.stream()
				// a= 1  b= 1    -> idenity
				// a= 1  b= 3
				// a= 3  b=5
				// a=15  b=7
				//
				.reduce(1, (a,b) -> a*b ); 
	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numbers) {
		return numbers.stream()
				// a= 1  b= 3
				// a= 3  b=5
				// a=15  b=7
				//
				.reduce( (a,b) -> a*b ); 
	}
	
	public static Optional<Student> highestSudentGPA() {
		return StudentDataBase.getAllStudents().stream()
				.reduce((a,b) -> a.getGpa() > b.getGpa() ? a : b);
	}
	
	public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,3,5,7); 
    System.out.println(performMultiplication(numbers));
    performMultiplicationWithoutIdentity(numbers).ifPresent(System.out::println);
    highestSudentGPA().ifPresent(System.out::println);

    
    
	}

}

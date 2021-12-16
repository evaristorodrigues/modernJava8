/**
 * 
 */
package br.com.evaristo.streams;

import java.util.Optional;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamFindAnyFirstExample {

	/**
	 * @param args
	 */
	
	public static Optional<Student> findAny(){
		return StudentDataBase.getAllStudents().stream()
				.filter((s) -> s.getGpa() >= 4.0)
				.findAny();
	}
	
	public static Optional<Student> findFirst(){
		return StudentDataBase.getAllStudents().stream()
				.filter((s) -> s.getGpa() >= 4.0)
				.findFirst();
	}
	public static void main(String[] args) {
		Optional<Student> findAnyOptional = findAny();
		if(findAnyOptional.isPresent()) {
			System.out.println("Result = "+findAnyOptional.get());			
		}else {
			System.out.println("Result Not Found");						
		}
		
		Optional<Student> findFirstOptional = findFirst();
		if(findFirstOptional.isPresent()) {
			System.out.println("Result = "+findFirstOptional.get());			
		}else {
			System.out.println("Result Not Found");						
		}		

	}

}

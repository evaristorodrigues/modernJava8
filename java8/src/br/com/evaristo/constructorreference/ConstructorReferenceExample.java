/**
 * 
 */
package br.com.evaristo;

import java.util.function.Function;
import java.util.function.Supplier;

import br.com.evaristo.data.Student;

/**
 * @author evari
 *
 */
public class ConstructorReferenceExample {

	/**
	 * @param args
	 */
	static Supplier<Student> supplierStudent = Student::new;
	static Function<String, Student> functionStudent = Student::new;

	public static void main(String[] args) {
		System.out.println(supplierStudent.get());
		System.out.println(functionStudent.apply("Evaristo"));
	}

}

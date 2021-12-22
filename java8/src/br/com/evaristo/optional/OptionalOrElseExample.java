/**
 * 
 */
package br.com.evaristo.optional;

import java.util.Optional;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class OptionalOrElseExample {

	/**
	 * @param args
	 */
	
	//OrElse
	public static String optionalOrElse() {
		Optional<Student> studentOtional = Optional.ofNullable(null);
		//Optional<Student> studentOtional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String name = studentOtional.map(Student::getName).orElse("Default");
		return name;
	}
	//OrElseGet
	public static String optionalOrElseGet() {
		Optional<Student> studentOtional = Optional.ofNullable(null);
		//Optional<Student> studentOtional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String name = studentOtional.map(Student::getName).orElseGet(() ->"Default");
		return name;
	}
	//OrElseThrow
	public static String optionalOrElseThrow() {
		Optional<Student> studentOtional = Optional.ofNullable(null);
		//Optional<Student> studentOtional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String name = studentOtional.map(Student::getName).orElseThrow(() ->new RuntimeException("Data not available rssr"));
		return name;
	}
	public static void main(String[] args) {
		System.out.println("OrElse: "+optionalOrElse());
		System.out.println("OrElseGet: "+optionalOrElseGet());
		System.out.println("orElseThrow: "+optionalOrElseThrow());


	}

}

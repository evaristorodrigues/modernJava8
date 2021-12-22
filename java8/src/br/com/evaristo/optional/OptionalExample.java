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
public class OptionalExample {

	/**
	 * @param args
	 */
	
	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		//Student student = null;
		if(student!= null) {
			return student.getName();
		}		
		return null;
	}
	
	public static Optional<String> getStudentNameOptional(){
		Optional<Student> studenOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> studenOptional = Optional.ofNullable(null);
		if(studenOptional.isPresent()) {
			return studenOptional.map(Student::getName);
		}
		
		return Optional.empty();

	}
	public static void main(String[] args) {
		/*
		 * String name = getStudentName();
		 * 
		 * if(name!= null) {
		 * System.out.println("Length of student name  : "+name.length()); }else {
		 * System.out.println("Name not found"); }
		 */
		
		Optional<String> stringOptional = getStudentNameOptional();
		
		if(stringOptional.isPresent()) {
			System.out.println("Length of student name  : "+stringOptional.get().length());
		}else {
			System.out.println("Name not found");
		}
	}

}

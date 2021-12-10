/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class SupplierExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () ->{
	        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));			
		};
		
		Supplier<List<Student>> listStudentSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println("Student is = "+studentSupplier.get());
		System.out.println("Students are= "+ listStudentSupplier.get());
	}

}

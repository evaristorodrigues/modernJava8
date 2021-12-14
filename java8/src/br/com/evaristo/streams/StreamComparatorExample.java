/**
 * 
 */
package br.com.evaristo.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamComparatorExample {

	/**
	 * @param args
	 */
	
	public static List<Student> sortStudentByName(){
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGPA(){
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGPADesc(){
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		sortStudentByName().forEach(System.out::println);
		System.out.println("");
		sortStudentByGPA().forEach(System.out::println);
		System.out.println("");		
		sortStudentByGPADesc().forEach(System.out::println);
		
	}

}

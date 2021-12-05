/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class ConsumerExample {

	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

	public static void printStudents() {
		System.out.println("Method printStudents");

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(c2);
		System.out.println("");

	}

	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(c3.andThen(c4));
		System.out.println("");
	}

	public static void printNameAndActivitiesConditions() {
		System.out.println("printNameAndActivitiesConditions");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(((student) -> {
			if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				c3.andThen(c4).andThen(c2).accept(student);
			}
		}));

		System.out.println("");
	}

	public static void main(String[] args) {

		// Simple example
		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("deus me ilumine");

		printStudents();
		printNameAndActivities();
		printNameAndActivitiesConditions();
	}

}

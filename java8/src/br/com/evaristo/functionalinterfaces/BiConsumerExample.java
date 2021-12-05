/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class BiConsumerExample {

	/**
	 * @param args
	 */

	public static void nameAndActivities() {
		List<Student> students = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer = (student, activities) -> {
			System.out.println("Student=" + student + " - Activities=" + activities);
		};
		students.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("A value: " + a + " - b value: " + b);
		};
		biConsumer.accept("Camila", "Evaristo");

		BiConsumer<Integer, Integer> mutiply = (a, b) -> {
			System.out.println("A x B = " + (a * b));
		};
		BiConsumer<Integer, Integer> divider = (a, b) -> {
			System.out.println("A / B = " + (a / b));
		};
		mutiply.andThen(divider).accept(10, 9);
		System.out.println();
		nameAndActivities();

	}

}

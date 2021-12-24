/**
 * 
 */
package br.com.evaristo.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class DefaultMethodExamples2 {

	/**
	 * @param args
	 */
	
	static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);



	private static void sortByName(List<Student> studentList) {
		System.out.println("After sortByName: ");
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	private static void sortByGPA(List<Student> studentList) {
		System.out.println("After sortByGPA: ");
		studentList.sort(gpaComparator);
		studentList.forEach(studentConsumer);
	}
	
	private static void comparatorChaining(List<Student> studentList) {
		System.out.println("After comparatorChaining: ");
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		studentList.forEach(studentConsumer);
	}
	
	private static void sortWithNullValues(List<Student> studentList) {
		System.out.println("After srtWithNullValues: ");
		Comparator<Student> nulValuesComparator = Comparator.nullsFirst(nameComparator);
		//Comparator<Student> nulValuesComparator = Comparator.nullsLast(nameComparator);
		studentList.sort(nulValuesComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
     List<Student> studentList = StudentDataBase.getAllStudents();
     System.out.println("Before Sort: ");
     studentList.forEach(studentConsumer);
     
     //sortByName(studentList);
    // sortByGPA(studentList);
     //comparatorChaining(studentList);
     sortWithNullValues(studentList);
	}

}

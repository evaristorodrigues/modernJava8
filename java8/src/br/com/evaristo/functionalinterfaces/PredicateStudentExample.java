/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class PredicateStudentExample {

    static Predicate<Student> p = (s) -> s.getGradeLevel() >=3;
    static Predicate<Student> p1 = (s) -> s.getGpa() >= 3.9;
    
    public static void filterStudentByGradeLevel() {
    	System.out.println("filterStudentByGradeLevel");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student)->{
			if(p.test(student)) {
		    	System.out.println(student);

			}
		});
    }
    
    public static void filterStudentByGpa() {
    	System.out.println("filterStudentByGpa");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student)->{
			if(p1.test(student)) {
		    	System.out.println(student);

			}
		});
    }
    
    public static void filterStudentByGradeLevelAndGpa() {
    	System.out.println("filterStudentByGradeLevelAndGpa");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student)->{
			if(p.and(p1).test(student)) {
		    	System.out.println(student);

			}
		});
    }
    
    public static void filterStudentByGradeLevelOrGpaNegate() {
    	System.out.println("filterStudentByGradeLevelOrGpaNegate");
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student)->{
			if(p.or(p1).negate().test(student)) {
		    	System.out.println(student);

			}
		});
    }
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		filterStudentByGpa();
		filterStudentByGradeLevelAndGpa();
		filterStudentByGradeLevelOrGpaNegate();
	}

}

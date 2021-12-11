/**
 * 
 */
package br.com.evaristo.methodreference;

import java.util.function.Predicate;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class RefactorMethodReferenceExample {

	/**
	 * @param args
	 */
    //static Predicate<Student> p = (s) -> s.getGradeLevel() >=3;
	static Predicate<Student> p =RefactorMethodReferenceExample::gradeLevelGraterThanThree;
	
	public static boolean gradeLevelGraterThanThree(Student s) {
		return s.getGradeLevel() >=3;
	}
	
	public static void main(String[] args) {
     System.out.println(StudentDataBase.studentSupplier.get());
	}

}

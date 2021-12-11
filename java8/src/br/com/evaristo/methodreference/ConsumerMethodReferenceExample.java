/**
 * 
 */
package br.com.evaristo.methodreference;

import java.util.function.Consumer;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printListOfActivities;
    
	public static void main(String[] args) {
		
     StudentDataBase.getAllStudents().forEach(c1);
     
     StudentDataBase.getAllStudents().forEach(c2);

	}

}

/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {
    	Map<String, Double> studentGradeMap = new HashMap<String, Double>();
    	students.forEach((s)->{
    		
    		if(PredicateStudentExample.p.test(s)) {
    			studentGradeMap.put(s.getName(), s.getGpa());
    		}
    		
    	} );
    	
    	return studentGradeMap;
    };
	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

	}

}

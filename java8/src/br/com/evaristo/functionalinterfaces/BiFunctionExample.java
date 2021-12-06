/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students,predicate) -> {
    	Map<String, Double> studentGradeMap = new HashMap<String, Double>();
    	students.forEach((s) ->{
    		if(predicate.test(s)) {
    			studentGradeMap.put(s.getName(), s.getGpa());
    		}
    	});
    	return studentGradeMap;
    };
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p));

	}

}

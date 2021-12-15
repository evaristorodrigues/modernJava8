/**
 * 
 */
package br.com.evaristo.streams;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamMapReduce {

	/**
	 * @param args
	 */
	
	public static Integer noOfNotebooks() {
		return StudentDataBase.getAllStudents().stream()
			   .filter((s) -> s.getGpa() >= 3.9)
			   .filter((s) -> s.getGender().equals("female"))
			   .map(Student::getNoteBooks)
			   //.reduce(0,(a,b) -> a+b)
			   .reduce(0, Integer::sum);
	}
	public static void main(String[] args) {
       System.out.println(noOfNotebooks());
	}

}

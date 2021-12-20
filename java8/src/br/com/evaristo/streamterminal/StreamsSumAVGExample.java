/**
 * 
 */
package br.com.evaristo.streamterminal;

import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamsSumAVGExample {

	/**
	 * @param args
	 */
	
	public static int sum() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static double avg() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String[] args) {
      System.out.println("Total No of Noebooks= "+sum());
      System.out.println("AVG No Ntoebooks= "+avg());

	}

}

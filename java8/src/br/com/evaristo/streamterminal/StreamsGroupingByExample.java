/**
 * 
 */
package br.com.evaristo.streamterminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.evaristo.data.Student;
import br.com.evaristo.data.StudentDataBase;

/**
 * @author evari
 *
 */
public class StreamsGroupingByExample {

	/**
	 * @param args
	 */
	
	public static Map<String, List<Student>> groupSudentByGender(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGender));
	}
	
	public static Map<String, List<Student>> customGroupByGPA(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(s -> s.getGpa() >= 3.9? "OUTSTANDING":"AVERAGE"));
	}
	
	public static Map<Integer, Map<String, List<Student>>> twoLevelGroupingBy_1(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(s -> s.getGpa() >= 3.9 ? "OUTSTANDING":"AVERAGE")));
	}
	
	public static Map<Integer, Integer> twoLevelGroupingBy_2(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));
	}

	public static LinkedHashMap<Integer, Set<Student>> threeLevelGroupingBy(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,LinkedHashMap::new, Collectors.toSet()));
	}
	
	public static Map<Integer, Student> calculateTopGPA(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(
						     Student::getGradeLevel, 
						     Collectors.collectingAndThen(
						          Collectors.maxBy(Comparator.comparing(Student::getGpa)),
						          Optional::get)));
	}
	public static Map<Integer, Student> calculateLeastGPA(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(
						     Student::getGradeLevel, 
						     Collectors.collectingAndThen(
						          Collectors.minBy(Comparator.comparing(Student::getGpa)),
						          Optional::get)));
	}	
	public static void main(String[] args) {
        System.out.println("groupSudentByGender - Only Classifier \n" +groupSudentByGender());
        System.out.println();
        System.out.println("customGroupByGPA - Specifying the name of groupigng \n" +customGroupByGPA());
        System.out.println();
        System.out.println("twoLevelGroupingBy_1 - two grouping \n"+ twoLevelGroupingBy_1());
        System.out.println();
        System.out.println("twoLevelGroupingBy_2 - grouping and counting the number of notebooks \n "+ twoLevelGroupingBy_2());
        System.out.println();
        System.out.println("threeLevelGroupingBy - grouping, overwriting the mapFactory and converting to Set \n "+ threeLevelGroupingBy());
        System.out.println();
        System.out.println("calculateTopGPA - grouping, CollectingAndThan \n "+ calculateTopGPA());
        System.out.println();
        System.out.println("calculateLeastGPA - grouping, CollectingAndThan \n "+ calculateLeastGPA());


	}

}

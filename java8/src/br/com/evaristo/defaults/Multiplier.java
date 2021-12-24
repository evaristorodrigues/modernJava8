package br.com.evaristo.defaults;

import java.util.List;

public interface Multiplier {

	int multiply(List<Integer> studentList);
	
	default int size(List<Integer> studentList) {
		System.out.println("Inside the interface Multiplier");
		return studentList.size();
	}
	
	static boolean isEmpty(List<Integer> studentList) {
		return studentList !=null && studentList.size() >0;
	}
}

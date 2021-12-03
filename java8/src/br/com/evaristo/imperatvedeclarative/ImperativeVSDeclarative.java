package br.com.evaristo.imperatvedeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVSDeclarative {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
		
		/** 
		 * Imperative 
		 */
		
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer i: integerList) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		
		System.out.println("uniqueList: "+ uniqueList);
		
		/*
		 * Declarative
		 */

		
		List<Integer> uniqueList1 = integerList.stream()
				                      .distinct()
				                      .collect(Collectors.toList());
		
		System.out.println("uniqueList1: "+ uniqueList1);

		
	}

}

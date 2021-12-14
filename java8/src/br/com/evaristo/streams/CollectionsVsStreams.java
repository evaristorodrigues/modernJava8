/**
 * 
 */
package br.com.evaristo.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author evari
 *
 */
public class CollectionsVsStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<String>();
     names.add("adam");
     names.add("jim");
     names.add("jenny");
     
     for(String name: names) {
    	 System.out.println(name);
     }
	 System.out.println("");

     for(String name: names) {
    	 System.out.println(name);
     }
	 System.out.println("");

     names.remove(0);
     System.out.println(names);
	 System.out.println("");

     Stream<String> namesStream = names.stream();
     
     namesStream.forEach(System.out::println);
  // namesStream.forEach(System.out::println); -->  java.lang.IllegalStateException: stream has already been operated upon or closed

     
	}

}

/**
 * 
 */
package br.com.evaristo.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author evari
 *
 */
public class StreamOfGenerateIterateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //Stream.of
		Stream<String> stringStream = Stream.of("Camila", "Joao", "Pedro", "Karen","Mariana","Manuela");
		stringStream.forEach(System.out::println);
		
		//Stream.iterate(seed, unaryOperator<>)
		Stream.iterate(1, x -> x*2)
		.limit(10)
		.forEach(System.out::println);
		
		//Stream.generate
		Supplier<Integer> supplier = new Random()::nextInt;
		Stream.generate(supplier)
		.limit(10)
		.forEach(System.out::println);
	
	}

}

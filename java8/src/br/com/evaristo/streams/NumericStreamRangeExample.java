/**
 * 
 */
package br.com.evaristo.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author evari
 *
 */
public class NumericStreamRangeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       IntStream intStream = IntStream.range(1, 50);
       System.out.println("IntStream Range Count = "+intStream.count());
       
       IntStream.range(1, 50).forEach((v) -> System.out.print(v+","));
       System.out.println();
       System.out.print("IntStream Range Closed ="+IntStream.rangeClosed(1,50).count());
       System.out.println();
       System.out.println("LongStream Range Closed Count="+LongStream.rangeClosed(1,50).count());
       LongStream.range(1, 50).forEach((v) -> System.out.print(v+","));
       System.out.println();
       System.out.println("DoubleStream");
       IntStream.range(1, 50).asDoubleStream().forEach((v) -> System.out.print(v+","));

	}

}

/**
 * 
 */
package br.com.evaristo.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * @author evari
 *
 */
public class ParallelStreamExample {

	/**
	 * @param args
	 */
	
	public static long checkPerformanceResult(Supplier<Integer> supplier, Integer numberOfTimes) {
		long startTime = System.currentTimeMillis();
		for( int i = 0; i < numberOfTimes; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	public static int sum_sequential_stream() {
		return IntStream.rangeClosed(1,1000000)
		.sum();
	}
	
	public static int sum_parallel_stream() {
		return IntStream.rangeClosed(1,1000000)
				.parallel() // Split the resource in mutiple parts
				.sum();
	}
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("Sequential Stream "+ checkPerformanceResult(ParallelStreamExample::sum_sequential_stream,100000));
		System.out.println("Parallel Stream "+ checkPerformanceResult(ParallelStreamExample::sum_parallel_stream, 100000));

	}

}

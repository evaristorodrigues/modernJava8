/**
 * 
 */
package br.com.evaristo.functionalinterfaces;

import java.util.function.Predicate;

/**
 * @author evari
 *
 */
public class PredicateExample {

    static Predicate<Integer> p = (a) ->{return  a%2==0;};
    static Predicate<Integer> p2 = (a) -> a%2==0;
    static Predicate<Integer> p3 = (a) -> a%5==0;
    
    static void predicateAnd() {
    	System.out.println("Predicate And result is: "+ p2.and(p3).test(10));
    	System.out.println("Predicate And result is: "+ p2.and(p3).test(9));

    }
    
    static void predicateOr() {
    	System.out.println("Predicate OR result is: "+ p2.or(p3).test(10));
    	System.out.println("Predicate OR result is: "+ p2.or(p3).test(8));

    }

    static void predicateNegate() {
    	System.out.println("Predicate OR Negate result is: "+ p2.or(p3).negate().test(10));

    }
    
    
	public static void main(String[] args) {
		System.out.println(p.test(4));
		System.out.println(p2.test(4));

		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}

package br.com.evaristo.defaults;

public interface Interface2 extends Interface1 {
	
	default void methodB() {
		System.out.println("Insde method B");
	}
	
	default void methodA() {
		System.out.println("Insde method A "+ Interface2.class );
	}

}

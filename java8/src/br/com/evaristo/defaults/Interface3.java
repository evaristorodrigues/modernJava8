package br.com.evaristo.defaults;

public interface Interface3 extends Interface2{
	
	default void methodC() {
		System.out.println("Insde method C");
	}

}

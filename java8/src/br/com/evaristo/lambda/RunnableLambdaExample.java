package br.com.evaristo.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
     /**
      * Prior Java 8
      *
      */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() { 
				System.out.println( "Inside Runnable 1 prior to Java 8");
				
			}
		};
		
		new Thread(runnable).start();
		
		//Runnable 2 Java 8
		Runnable runnable2 = () ->{
			System.out.println( "Inside Runnable 2 Java 8");
		};
		
		new Thread(runnable2).start();
		
		//Runnable 3 Java 8 without body
		Runnable runnable3 = () -> System.out.println( "Inside Runnable 3 Java 8 without body");

		new Thread(runnable3).start();
		
		//Runnable 3.1 passed as parameter prior to Java 8 Java 8
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println( "Inside Runnable 3.1 passed as parameter prior to Java 8 Java 8");
				
			}
		}).start();		
		
		// Runnable 4 Java 8 pass as parameter
		new Thread(() -> System.out.println("Inside Runnable 4 Java 8 passed as parameter")).start();
		
		
	}

}

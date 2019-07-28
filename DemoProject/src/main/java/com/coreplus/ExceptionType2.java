package com.coreplus;

//suppressing exception using throws keyword
//dont want to use trycatch

public class ExceptionType2 {

	public static void main(String[] args) { 
			
			int x=10,y=1,z;
			try { 
			z=x*y;
			if(z>10) {
			throw new ArithmeticException();
			}
			System.out.println(z);
			run();
			}catch(ArithmeticException e) {
				System.out.println("insid");
			}
			
	}	
		static void run() throws ArithmeticException {
		int a=10,b=10,c;
		c=a/b;
		System.out.println(c);
		System.out.println("hey");
	
}
}

package com.coreplus;

//Exceptions are CompileTimeExceptions & RunTimeExceptions
// ComplileTime Exceptions occur due to syntax error in our code eg:c=a+b(we missed semi colon)
//RunTimeException occur due to logical error like a=10,b=0, c=a/b;
//ArthematicExceptions
//ArrayIndexOutofBoundException
//IOException
//NuulPointerxception
//we can 1.handling exception 2.surpressing exception 3.focefully throwing exception
// 1.tryCatch, 2.throws, 3.throw
public class ExceptionType1 {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
			c=a-b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println("hey");
		}
		
		
	}

}

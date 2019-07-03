package com.core;

public class ArrayDemo {
	
	public static void passByReference(String a[] ) {
		a[0]= "change";
	}

	public static void main(String[] args) {
		String []array= {"apple","mango","banana"};
		System.out.println("before function call:"+array[0]);
		ArrayDemo.passByReference(array);
		System.out.println("After function call:"+array[0]);
		
	}

}

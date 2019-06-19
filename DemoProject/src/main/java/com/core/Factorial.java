package com.core;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int total=0;
		total=n*(n-1);
		for (int i = 3; i > 0; i--) {
			total=total*i;
		}
		System.out.println(total);
		
	}

}

package com.core;

public class FibnociSeries {

	public static void main(String[] args) {
		int fibnaci = 0;
		int total = 0;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a+" "+b);
		for (int i = 0; i < 5; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

}

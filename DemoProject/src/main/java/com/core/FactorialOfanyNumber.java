package com.core;

import java.util.Scanner;

public class FactorialOfanyNumber {

	public static void main(String[] args) {
		int num,factorial=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a numer ");
		num=s.nextInt();
		System.out.println(num);
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}

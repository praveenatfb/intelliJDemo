package com.core;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter year");
		num=s.nextInt();
		System.out.println(num);
		if(num%4==0 && num%400==0) 
			System.out.println("given year is leap year");
		else
			System.out.println("not a leap year");
		
		
	}

}

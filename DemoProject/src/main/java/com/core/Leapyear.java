package com.core;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a year");
		year=s.nextInt();
		if(year%4==0)
			System.out.println("given year is a leap year");
		else
			System.out.println("not a leap year");
	}

}

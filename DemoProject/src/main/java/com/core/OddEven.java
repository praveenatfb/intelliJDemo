package com.core;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to check whether it is odd or even");
		number=s.nextInt();
		if(number%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}

}

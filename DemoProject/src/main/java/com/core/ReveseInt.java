package com.core;

import java.util.Scanner;

public class ReveseInt {

	public static void main(String[] args) {
		int reverse=0,num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to reverse");
		num=s.nextInt();
		while(num!=0) {		
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
		}
		System.out.println(reverse);
	
	}

}

package com.core;

import java.util.Scanner;

public class Palendrom {

	public static void main(String[] args) {
		
		int n,remainder,temp,sum=0;
		
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		temp=n;
		while(n>0) {
			remainder=n%10;
			sum=(sum*10)+remainder;
			n=n/10;
			System.out.println(n);
			}
		if(temp==sum) 
			System.out.println("palendrom");
			else
				System.out.println("not apalendrom");
		}
		
	}



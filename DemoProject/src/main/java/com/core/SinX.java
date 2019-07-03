package com.core;

import java.util.Scanner;

public class SinX {

	public static void main(String[] args) {
		int n,x;
		double sum=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			x=i;
			int y=x;
			sum+=power(x,y)/factorial(y);
			System.out.println(sum);
		}
		System.out.println("sinX value is:"+sum);
	}
	public static double power(int x,int y) {
		double pow=1;
		for(int i=0;i<y;i++) 
			pow=pow*x;
		System.out.println("in pow"+pow);
		return pow;
	}
	public static int factorial(int y) {
		int fact=1;
		for(int i=1;i<=y;i++)
		fact = fact*i;
		System.out.println("in fact"+fact);
		return fact;
	}

}

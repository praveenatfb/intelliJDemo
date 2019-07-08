package com.core;

import java.util.Scanner;

public class SinXprog {

	public static void main(String[] args) {
		int n;
		double x,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter x value");
		x=s.nextInt();
		System.out.println("enter series limit n value");
		n=s.nextInt();
		x=x*(3.1415/180);
		for(int i=1,j=1;i<=n;i++,j=j+2) {
			if(i%2!=0) 
				sum =sum+pow(x,j)/fact(j);
			else
				sum=sum-pow(x,j)/fact(j);
			System.out.println(sum);
			
		}
		System.out.println("sinX value is:"+sum);
	}

	private static double pow(double x, int j) {
		double power=1;
		for(int i=1;i<=j;i++)
			power=power*j;
		return power;
	}

	private static double fact(int j) {
		double factorial=1;
		for(int i=0;i<j;i++)
			factorial=factorial*i;
		return factorial;
	}

}

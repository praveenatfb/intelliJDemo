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
			sum+=Math.pow(x,y)/y;
			System.out.println(sum);
		}
		System.out.println("sinX value is:"+sum);
	}

}

package com.core;

import java.util.Scanner;

public class OnenumPowerOfAnother {

	public static void main(String[] args) {
		int p,q;
		long sum=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two num");
		p=s.nextInt();
		q=s.nextInt();
		System.out.println(+p+" "+q);
		for(int i=1;i<=q;i++) {
			sum=sum*p;
		}
		System.out.println(sum);
	}
	

}

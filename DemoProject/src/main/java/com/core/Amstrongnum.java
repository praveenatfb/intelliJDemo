package com.core;

public class Amstrongnum {

	public static void main(String[] args) {
		int num,sum,d;
		
		for(int i=1;i<=500;i++) {
			sum=0;
			num=i;
		
			 while(num>0) {
				d=num%10;
				sum+=(d*d*d);
				num=num/10;
			}
		
		if(sum==i) {
			System.out.println(i+" ");
		}
		sum=0;
	}
	}
}

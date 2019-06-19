package com.core;

public class SumofNumber {

	public static void main(String[] args) {
		int num=7145;
		int total=0, sum;
		while(num!=0) {
			sum=num%10;
			total=total+sum;
			num=num/10;
		}
		System.out.println(total);
	}

}

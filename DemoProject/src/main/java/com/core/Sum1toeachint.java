package com.core;

import java.util.Scanner;

public class Sum1toeachint {

	public static void main(String[] args) {
		int num,total=0,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER AN INTEGER");
		num=s.nextInt();
		
		while(num!=0) {
			sum=num%10;
			sum=sum+1;
			total=total*10+sum;
			num=num/10;
		}
		num=total;
		int reverse=0;
		while(num>0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		System.out.println(reverse);
	}
}

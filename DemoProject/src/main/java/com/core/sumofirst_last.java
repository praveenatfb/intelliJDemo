package com.core;

import java.util.Scanner;

public class sumofirst_last {

	public static void main(String[] args) {
		int sum,total=0,num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		num=s.nextInt();
		System.out.println(num);
		sum=num%10;
		total+=sum;
		do{
			num=num/10;

			if(num<=9&&num>=0)
			{
			total+=num;
			}
		}while(num!=0);
		System.out.println(total);
	}


}

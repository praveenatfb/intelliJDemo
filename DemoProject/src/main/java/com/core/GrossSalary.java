package com.core;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		int grosssalary,basicpay,da,hra;
		System.out.println("enter basic salary");
		Scanner s=new Scanner(System.in);
		basicpay=s.nextInt();
		da=basicpay*40/100;
		hra=basicpay*20/100;
		grosssalary=basicpay+da+hra;
		System.out.println(basicpay+"\n"+"DA="+da+"\n"
		+"HRA is="+hra+"\n"+"grosssalary is ="+grosssalary);
		
	}

}

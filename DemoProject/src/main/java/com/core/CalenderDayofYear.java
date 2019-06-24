package com.core;

import java.util.Scanner;

public class CalenderDayofYear {

	public static void main(String[] args) {
		int year,num,total,day;
		Scanner s=new Scanner(System.in);
		System.out.println("enter year");
		year=s.nextInt();
		System.out.println(year);
		num=year%100;
		System.out.println(num);
		total=num/4;
		System.out.println(total);
		total=total+1+1;
		System.out.println(total);
		if(year/100==17) 
			 total=total+4;
		 else if(year/100==18)
			 total=total+2;
		 else if(year/100==19)
			 total=total+0;
		 else if(year/100==20)
			 total=total+6;
		 else
			 System.out.println("above 2400 -400");
		System.out.println(num);
		total=total+num;
		day=total%7;
		System.out.println(day);
		switch(day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tyesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("satuarday");
			break;
		default :
			System.out.println("error");
		}
	}

}

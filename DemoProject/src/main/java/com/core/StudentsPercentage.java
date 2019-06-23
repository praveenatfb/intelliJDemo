package com.core;

import java.util.Scanner;

public class StudentsPercentage {

	public static void main(String[] args) {
		int n,sum=0;
		float percentage=0;
		System.out.println("entr no of subjects");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int marks[]=new int[n];
		System.out.println("enter student marks");
		for(int i=0;i<n;i++) {
			marks[i]=s.nextInt();
			sum +=marks[i];
		}
		System.out.println(sum);
		percentage +=sum/n;
		System.out.println(percentage);
	}

}

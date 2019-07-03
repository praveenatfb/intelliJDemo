package com.core;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int []array;
		Scanner s=new Scanner(System.in);
		System.out.println("enter elements");
		array=new int[6];
		for(int i=0;i<6;i++) {
			array[i]=s.nextInt();
		}
		for(int j=0;j<6;j++) {
			System.out.println(array[j]);
		}
	}

}

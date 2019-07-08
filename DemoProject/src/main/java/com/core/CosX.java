package com.core;

import java.util.Scanner;

public class CosX {

	public static void main(String[] args) {
		double sum1 = 0, sum2 = 1, total = 0;
		int n, x, y, i = 2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value to calculate cosX");
		n = s.nextInt();
		System.out.println(n);
		while (i <= n) {
			x = i;
			y = x;
			sum1 += pow(x, y) / factorial(y);
			i = i + 2;
			System.out.println("sum1 value is:" + sum1);
		}
		System.out.println("cosX value is:" + sum1);
		i = 4;
		while (i <= n) {
			x = i;
			y = x;
			sum2 += pow(x, y) / factorial(y);
			i = i + 4;
			System.out.println("sum2 value is " + sum2);
		}
		System.out.println("cosX value is:" + sum1);
		total = sum2 - sum1;
		System.out.println("total :" + total);
	}

	private static double pow(int x, int y) {
		double pow = 1;
		for (int i = 1; i < y; i++)
			pow = pow * x;
		return pow;
	}

	private static int factorial(int y) {
		int fact = 1;
		for (int i = 1; i <= y; i++)
			fact = fact * i;
		return fact;
	}

}

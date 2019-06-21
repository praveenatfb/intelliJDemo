package com.core;

public class InsertionSort {

	public static void main(String[] args) {
		int[] num = { 7, 2, 6, 1, 8, 9 };
		int temp = 0, i, j;
		for (i = 0; i < num.length; i++) {
			temp = num[i];
		j = i;
		
		while (j > 0 && temp < num[j - 1]) {
			num[j] = num[j - 1];
			j = j - 1;
		}
		num[j] = temp;
	
	}
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	}

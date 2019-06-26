package com.core;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int b[][] =new int[2][2];
		int c[][] =new int[2][2];
		int m, n, p, q;
		Scanner s = new Scanner(System.in);
		System.out.println("enter matrix size os a");
		m = s.nextInt();
		n = s.nextInt();
		System.out.println("enter matrix a elements");
		for (int i = 0; i <= m - 1; i++)
			for (int j = 0; j <= n - 1; j++) {
				a[i][j] = s.nextInt();
			}
		System.out.println("enter matrix size of B");
		p = s.nextInt();
		q = s.nextInt();
		System.out.println("enter matrix B elements");
		for (int i = 0; i <= p - 1; i++)
			for (int j = 0; j <= q - 1; j++) {
				b[i][j]=s.nextInt();
			}
		for(int i=0;i<=m-1;i++)
			for(int j=0;j<=q-1;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
	/*	for(int i=0;i<=m-1;i++)
			for(int j=0;j<=q-1;j++) {
				 System.out.print(c[i][j]+"");
			}*/
		for(int []row:c)
			System.out.println(Arrays.toString(row));
	}

}

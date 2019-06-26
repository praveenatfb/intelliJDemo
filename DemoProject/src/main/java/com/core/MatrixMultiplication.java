package com.core;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int m, n, p, q,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter matrix size of A");
		m = s.nextInt();
		n = s.nextInt();
		System.out.println("enter matrix size of b");
		p = s.nextInt();
		q = s.nextInt();
		if(n!=p) {
			System.out.println("matrix multi not possibe");
		}
		else {
		int a[][] = new int[m][n];
		int b[][] = new int[p][q];
		int c[][] = new int[m][q];
		
		System.out.println("entr matrix elements");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				a[i][j]=s.nextInt();
			}
		System.out.println("entr matrix elements");
		for (int i = 0; i < p; i++)
			for (int j = 0; j < q; j++) {
				b[i][j]=s.nextInt();
			}
		for(int i=0;i<m;i++) {
			for(int j=0;j<q;j++) {
				for(int k=0;k<p;k++) {
				sum=sum+a[i][k]*b[k][j];	
				}
				c[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<m;i++)
			for(int j=0;j<q;j++) {
				System.out.println(c[i][j]+"\t");
				
				System.out.println("\n");
			}
				
		}
	}

}

package com.core;

public class InsertionSort {

	public static void main(String[] args) {
		int []n= {7,2,6,1,8,9};
		int swap=0,min=0,i,j;
		for (i=0;i<n[i]-1;i++)
			min=i;
			for(j=i+1;j<n[j];j++) {
				if(n[i]>n[j]) {
					min=j;
				}}
				swap=n[min];
				n[min]=n[j];
				n[j]=swap;
		//		}
		//	}
			for(i=0;i<n.length;i++) {
				System.out.println(n[i]+" ");
			}
	}

}

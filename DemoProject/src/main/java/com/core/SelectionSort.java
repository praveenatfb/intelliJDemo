package com.core;

public class SelectionSort {

	public static void main(String[] args) {
		int []num= {4,6,2,1,8,7};
		int small=0,swap=0,i,j;
		for(i=0;i<num.length-1;i++)
			for(j=i+1;num[j]<num.length;j++) {
				if(num[i]>num[j])
				//i=j;
			swap=num[i];
			num[i]=num[j];
			num[j]=swap;
			}
			for(i=0;i<num.length;i++) {
				//for( j=i-1;j>i;j--) {
					System.out.println(num[i]);
				}
	}

}

package com.core;

public class BubbleSort {

	public static void main(String[] args) {
		int []num = {25,78,56,11};
		int temp,k,i;
		for(k=0;k<num.length-1;k++)
			for(i=0;i<num.length-k-1;i++) {
				if(num[i]>num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
				
			}
		for(i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
	}

}

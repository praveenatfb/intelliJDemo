package com.core;

public class Literacy {

	public static void main(String[] args) {
		int population=80000,totlit;
		int litmen=0,litwomen=0;
		litmen +=35*80000/100;
		System.out.println(litmen);
		totlit=48*80000/100;
		System.out.println(totlit);
		litwomen=totlit-litmen;
		System.out.println(litwomen);
	}

}

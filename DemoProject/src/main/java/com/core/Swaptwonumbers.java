package com.core;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		int p,q,swap;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers to swap");
		p=s.nextInt();
		q=s.nextInt();
		System.out.println(p+"\n"+q);
		if(p!=0&&q!=0) {
			swap=p;
			p=q;
			q=swap;
		}
		System.out.println("after swaping:"+p+"\n"+q);
		
	}

}

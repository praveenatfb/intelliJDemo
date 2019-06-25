package com.core;

import java.util.Scanner;

public class AgeProg {

	public static void main(String[] args) {
		int ram,shyam,ajay;
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		ram=s.nextInt();
		shyam=s.nextInt();
		ajay=s.nextInt();
		System.out.println("ram age is:"+ram+" "+"Shyam age is:"+shyam+" "+"ajay age is:"+ajay);
		if(ram<shyam &&ram<ajay)
			System.out.println("ram is yougest");
		else if(shyam<ajay&&shyam<ram)
			System.out.println("shyam is youngest");
		else
			System.out.println("ajay is youngest");
	}

}

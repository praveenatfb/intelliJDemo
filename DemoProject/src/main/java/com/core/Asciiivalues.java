package com.core;

import java.util.Scanner;

public class Asciiivalues {

	public static void main(String[] args) {
		int i=0,num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value to display ascci code");
		num=s.nextInt();
		while(num!=-1) {
			char ch=(char)num;
			System.out.println(num);
			System.out.println(ch);
			num--;
		}
		/*for(char letter= ' ';letter<274;letter++) {
			System.out.println(letter);
		}*/
	}

}

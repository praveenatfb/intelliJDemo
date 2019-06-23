package com.core;

import java.util.Scanner;

public class CentigradeToFahrenheit {

	public static void main(String[] args) {
		float centigrade,fahrenheit;
		System.out.println("enter temperature in centigrades");
		Scanner s=new Scanner(System.in);
		centigrade=s.nextFloat();
		System.out.println(centigrade);
		fahrenheit=centigrade*9/5+32;
		System.out.println(fahrenheit);
	}

}

package com.core;

import java.util.Scanner;

public class KilometerToMeters {

	public static void main(String[] args) {
		int kilometers,meter,centimeters;
		double feet;
		System.out.println("enter kilometers between to cities");
		Scanner s=new Scanner(System.in);
		kilometers=s.nextInt();
		System.out.println(kilometers);
		meter=kilometers*1000;
		centimeters=kilometers*100000;
		feet=kilometers*3280.84;
		System.out.println(meter);
		System.out.println(centimeters);
		System.out.println(feet);
	}

}

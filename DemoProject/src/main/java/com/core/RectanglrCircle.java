package com.core;

import java.util.Scanner;

public class RectanglrCircle {

	public static void main(String[] args) {
		double area_rectangle,area_circle,circumference;
		float l,b,r,perimeter;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of rectangle");
		l=s.nextFloat();
		System.out.println("enter breadth of rectangle");
		b=s.nextFloat();
		System.out.println("enter radius of circle");
		r=s.nextFloat();
		System.out.println(l+"\n"+b+"\n"+r);
		area_rectangle=l*b;
		perimeter=2*(l+b);
		area_circle=3.14*r*r;
		circumference=3.14*2*r;
		System.out.println("area circle="+area_circle+"\ncircumference="+circumference);
		System.out.println("area of recrangle="+area_rectangle+"\n perimeter="+perimeter);
	}

}

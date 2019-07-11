package com.core;

class Shape{
	void area(int l,int b) {
		int area;
		area=l*b;
		System.out.println(area);
	}
	void area(int s){
		int area;
		area=2*s;
		System.out.println(area);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(20);
		s.area(10, 24);
	}

}

package com.core;

class Regular1{
	private int x=7;
	void display() {
		System.out.println("display method in Regular class:"+x);
		Inner i=new Inner();
		i.outer();
	}
	class Inner{
		void outer() {
			System.out.println("outer method variable displaying from Inner class:"+x);
		}

	}
}

public class RegularInner {

	public static void main(String[] args) {
		Regular1 r=new Regular1();
		r.display();
	}

}

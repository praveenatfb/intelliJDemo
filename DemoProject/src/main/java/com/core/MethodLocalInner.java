package com.core;

class Outer2{
	String name="john";
	void display() {
		
		class Inner2{
			void show() {
				System.out.println("inside method inner class");
			}
		}
		Inner2 i=new Inner2();
		i.show();
	}
}

public class MethodLocalInner {

	public static void main(String[] args) {
		Outer2 o=new Outer2();
		o.display();
	}

}

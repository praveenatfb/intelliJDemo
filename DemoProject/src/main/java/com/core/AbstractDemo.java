package com.core;

abstract class Abs{
	Abs(){
		System.out.println("constructor");
	}
	abstract void display();
	static void show() {
		int no=10;
		System.out.println(no);
		}
	void draw() {
		String shape="circle";
		System.out.println(shape);
	}
}
class Abs1 extends Abs{
	void display() {
		System.out.println("in concrete class");
	}
	static void show() {
		System.out.println("inside concrete static");
		
	}
	void draw() {
		System.out.println("indide draw");
	}
	void get() {
		super.show();
		super.draw();
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Abs1 a=new Abs1();
		a.display();
		a.draw();
		a.show();
		a.get();
		//Abs k=new Abs(); can't instantiate
	}

}

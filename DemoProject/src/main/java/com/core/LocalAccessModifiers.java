package com.core;

abstract class LocalDemo{
	int age=60;
	String name="chai";
	abstract void show();
	final void display() {
		final  int no=25;
		String name="saam";
		String designation="manager";
		System.out.println(no);
		System.out.println(name);
		System.out.println(designation);
		System.out.println(age);
	}
}
class Local1 extends LocalDemo{
	int age=20;
	void show() {
		super.display();
		System.out.println(age);
	}
}

public class LocalAccessModifiers {

	public static void main(String[] args) {
		
		//LocalDemo l=new LocalDemo();
	//	l.display();
		Local1 l1=new Local1();
		l1.show();
	}

}

package com.core;

class pen{
	int cost=10;
	String name="ballpEn";
	String brand="renold";
	void display() {
		System.out.println("inside base class");
	}
}
class Renolds extends pen{
	int cost=20;
	void display() {
		super.display();
		System.out.println(super.cost+"\t"+super.name+"\t"+super.brand);
		System.out.println("cost in derived class:"+cost);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		Renolds r=new Renolds();
		r.display();
	}
}

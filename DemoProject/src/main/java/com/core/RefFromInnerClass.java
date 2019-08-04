package com.core;

class Outer{
	private String name="saam";
	void nameDisplay() {
		System.out.println("name from outer class method:"+name);
		Inner i=new Inner();
		i.display();
	}
	class Inner{
		void display() {
			System.out.println("name from inner method "+name);
			System.out.println("ref of the inner class is "+this);
			System.out.println("ref of outer class " +Outer.this);
		}
	}
}

public class RefFromInnerClass {

	public static void main(String[] args) {
		Outer.Inner o=new Outer().new Inner();
		//o.nameDisplay();
		o.display();
	}

}

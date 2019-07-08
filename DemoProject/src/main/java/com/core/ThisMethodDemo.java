package com.core;

class Method{
	void m() {
		System.out.println("method inside m");
	}
	void n() {
		System.out.println("method n");
		m();
	}
}
class Method1 extends Method{
	void display() {
		System.out.println("method display");
		m();
	}
}
public class ThisMethodDemo {

	public static void main(String[] args) {
		Method m=new Method();
		m.n();
		Method1 m1=new Method1();
		m1.display();
	}

}

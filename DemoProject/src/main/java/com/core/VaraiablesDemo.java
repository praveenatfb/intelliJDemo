package com.core;

class Test{
	int no;
	String name;
	float total;
	Test(){
		
	}
	void display() {
		System.out.println(no);
		System.out.println(name);
		System.out.println(total);
	}
	
}
class Test2{
	Test2(){
}
	
	void display(){
	int num=10;
	String name="saam";
	System.out.println(num+" \n"+name);
}
}
public    class VaraiablesDemo {
static 	byte a;
static	short b;
static	int x;
static	long y;
static	float m;
static	double n;
static	boolean p;
static char name='A';
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.display();
		Test2 obj=new Test2();
		obj.display();
		
		System.out.println(+name+" "+a+" "+b+" "+x+" "+y+" "+m+" "+n+" "+p);
	}

}

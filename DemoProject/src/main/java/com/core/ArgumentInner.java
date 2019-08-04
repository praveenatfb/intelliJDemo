package com.core;
class MyClass{
	void go() {
		Bar b=new Bar();
		b.doStuff(new Foo(){
			public void foof() {
				System.out.println("foofy");
			}
		});
	}
}
interface Foo{
	void foof();
}
class Bar{
	void doStuff(Foo f) {
		
	}
}

public class ArgumentInner {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.go();
	}

}

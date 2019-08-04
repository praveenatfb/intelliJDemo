package com.core;

class BigOuter{
	static class Nest{
		void go() {
			System.out.println("hi");
		}
	}
}


public class StaticInner {
	
	static class b2{
		void goB2() {
			System.out.println("hi B2");
		}
	}

	public static void main(String[] args) {
		BigOuter.Nest bn=new BigOuter.Nest();
		bn.go();
		b2 b=new b2();
		b.goB2();
	}

}

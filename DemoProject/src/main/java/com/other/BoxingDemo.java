package com.other;

public class BoxingDemo {

	public static void main(String[] args) {
		Integer a=456;
		Integer b=456;
		if(a!=b) {
			System.out.println("diff Objects");
		}
		if(a.equals(b)) {
			System.out.println("meaningfuuly equal");
		}
		Integer x=10;
		Integer y=10;
		if(x==y) {
			System.out.println("same Objects");
		}
		if(x.equals(y)) {
			System.out.println("meaningfuuly equal");
		}
		BoxingDemo u=new BoxingDemo();
		u.go(5);
	}
		boolean go(Integer i) {
			boolean ifSo=true;
			short s=300;
			System.out.println(i);
		if(ifSo) {
			System.out.println(++s);
			
		}
		return ifSo;
		}
}

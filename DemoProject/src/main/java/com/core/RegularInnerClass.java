package com.core;

class Regular{
	class Inner{
		int rollno;
		String name;
		void display() {
			System.out.println(rollno);
			System.out.println(name);
		}
	}
}

public class RegularInnerClass {

	public static void main(String[] args) {
		Regular r=new Regular();
		Regular.Inner i=r.new Inner();
		i.display();
	}

}

package com.core;

class DemoBlock{
	{	int x=10;
		System.out.println("this in the class Block"+x);
	}
	static {
		int y=20;
		System.out.println("this in the static block inside class"+y);
	}
	
	void display(){
		{	int k=100;
			System.out.println("this in method Block"+k);
			
		}
		
	}
}

public class StaticBlockDemo {

	static {	int z=111;
		System.out.println("static Block"+z);
	}
	public static void main(String[] args) {
		DemoBlock db=new DemoBlock();
		db.display();
		{	int a=444;
			System.out.println("inside Block"+a);
		}
	}

}

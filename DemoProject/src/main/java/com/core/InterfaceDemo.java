package com.core;

interface Inter{
	 public int no=100;
	 final static String name="saam";
	 
	//  public void show();
	  abstract void display();
	//  static void go() {   }
	 // void pray();
}

class Interface1 implements Inter{
	 public void display(){
		System.out.println("interface implementation");
		System.out.println(no+" "+name);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Interface1 i=new Interface1();
		i.display();
		
	}

}

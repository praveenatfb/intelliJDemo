package com.core;

class Man{
	int no;
	String name;
	Man(){
		this(1);
	}
	Man(int no){
		this(2,"saam");
		System.out.println(no);
	}
	Man(int no,String name){
		System.out.println(no+" "+name);
	}
}



public class ConstructorThis {

	public static void main(String[] args) {
		
		Man m=new Man();
	}

}

package com.core;

class Student{
	private int rollno;
	private String name;
	public String setName(String name){
		
		this.name=name;
		return name;
	}
	public void getName(){
		System.out.println(name);
	}
}

public class EncapsuationDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("kabir");
		s.getName();
	}

}

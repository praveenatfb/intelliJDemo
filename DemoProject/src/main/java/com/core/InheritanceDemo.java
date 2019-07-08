package com.core;



class Cycle{
	int no;
	String name;
	String model;
	Cycle(int no,String name,String model){
		
		this.no=no;
		this.name=name;
		this.model=model;
	}
	void dispaly() {
		System.out.println("cycle serial number"+no);
		System.out.println("name of the cycle"+name);
		System.out.println("cycle model"+model);
		
	}
	
	}
class GearCycle extends Cycle{
	
	GearCycle(int no, String name, String model) {
		super(no, name, model);
	}
	
	void speed() {
		
		super.dispaly();
	}
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		GearCycle c=new GearCycle(1, "hero", "Gear");
		c.speed();
		
		
	}

}

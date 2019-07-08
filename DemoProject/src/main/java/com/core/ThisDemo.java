package com.core;

class Bike{
	int serialNo;
	String name;
	String model;
	int price=12000;
	Bike(){
		
	}
Bike(int serialNo,String name,String model){
		this.serialNo=serialNo;
		this.name=name;
		this.model=model;
	}
	void display() {
		System.out.println(serialNo+"\t"+name+"\t"+model+"\t");
	}
}

class Honda extends Bike{
	int gear=4;
	
	Honda(int serialNo,String name,String model,int gear){
		super( serialNo, name, model);
	this.gear=serialNo;
	this.name= name;
	this.model= model;
	
	System.out.println(gear);
	System.out.println(price);
}
}
public class ThisDemo {

	public static void main(String[] args) {
		Bike b=new Bike(1245,"hero","passion");
		Bike b1=new Bike(5478,"suzuki","samurai");
		b.display();
		b1.display();
		Honda h=new Honda(1245,"hero","passion",4);
		h.display();
	}

}

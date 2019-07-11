package com.core;

class Car{
	
	public int no=1234;
	protected String name="swift";
	private String brand="marutisuzuki";
	int cost=8;
	Car(){
		
	}
	public Car(int i, String string, String string2, int j) {
		no=i;
		name=string;
		brand=string2;
		cost=j;
	}
	 protected void show() {
		 	System.out.println(no);
			System.out.println(name);
			System.out.println(brand);
			System.out.println(cost);		
	}
}
class Tata extends Car{
	void display() {
		super.show();
		System.out.println(no);
		System.out.println(name);
	//	System.out.println(super.brand);
		System.out.println(cost);
	}
}

public class AccessModifiersVariables {

	public static void main(String[] args) {
		Car c=new Car(1542,"nexon","TATA",25);
		c.show();
		Tata t=new Tata();
		t.display();
	}

}

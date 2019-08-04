package com.core;

interface Cookable{
	public void cook();
}

 class Food1{
	Cookable c=new Cookable() {
	public void cook() {
		System.out.println("Anonnymous implements");
	}
	
	
};
}

public class OldAnonymouInnerClass2 {

	public static void main(String[] args) {
		Food1 f=new Food1();
		cook();
		
	}

}

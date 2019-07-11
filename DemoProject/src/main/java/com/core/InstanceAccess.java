package com.core;

class FinalDemo{
	final int serial=20;
	static String name="SAAM";
	FinalDemo(){
		System.out.println(serial);
		System.out.println(name);
	}
	FinalDemo(int i,String j){
	//	serial=i;
		name=j;
		//System.out.println(serial);
		System.out.println(name);

	}
}

public class InstanceAccess {

	public static void main(String[] args) {
		FinalDemo fd=new FinalDemo(1,"rock");
		FinalDemo f=new FinalDemo();
	}

}

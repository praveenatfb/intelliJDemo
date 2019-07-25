package com.other;

class Moof{
	int moofValue;
	Moof(int val){
		moofValue=val;
	}
	public int getMoofValue() {
		return moofValue;
	}
	public boolean equals(Object o) {
		if((o instanceof Moof)&& (((Moof)o).getMoofValue()==this.moofValue)) {
			return true;
		}else {
				return false;
		}
	}
}

public class EqualsDemo {

	public static void main(String[] args) {
		
		Moof m=new Moof(6);
		Moof n=new Moof(7);
		if(m.equals(n)) 
			System.out.println("m and n are equal");
			else
				System.out.println("not equal");
		}
	}



package com.other;

class HasHash{
	int x;
	HasHash(int xVal){
		x=xVal;
	}
	public boolean equals(Object o) {
		HasHash h=(HasHash)o;
		if(h.x==this.x)
			return true;
		else
			return false;
	}
	public int hashCode() {
		return x;
	}
}

public class HashCodeDemo {

	public static void main(String[] args) {
		HasHash h=new HasHash(2);
		HasHash h1=new HasHash(2);
		if(h.equals(h1)) 
			System.out.println("m and n are equal");
			else
				System.out.println("not equal");
		System.out.println(h);
		System.out.println(h1);
	}

}

package com.other;

class Bob{
	int shoeSize;
	String nickName;
	Bob(String nickName,int shoeSize){
		this.nickName=nickName;
		this.shoeSize=shoeSize;
	}
	public String toString() {
		return ("this Bob and my nickname is " + "\t" +nickName+ "and my shoe size is" +shoeSize);
		
	}
}

public class ToStringDemo {

	public static void main(String[] args) {
		Bob b=new Bob("saam",8);
		System.out.println(b);
	}

}
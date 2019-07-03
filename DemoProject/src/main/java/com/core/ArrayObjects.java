package com.core;

class Account{
	int a,b;
	public void setData(int x,int y) {
		a=x;
		b=y;
	}
	public void showData() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class ArrayObjects {

	public static void main(String[] args)  {
		Account[] obj=new Account[2];
		//Account obj[]= {
		//		new Account(),new Account()
		//};
		obj[0]=new Account();
		obj[0].setData(2,3);
		obj[1]= new Account();
		obj[1].setData(4,5);
		System.out.println("elements in a[0]");
		obj[0].showData();
		System.out.println("elements in a[1]");
		obj[1].showData();
	}
}
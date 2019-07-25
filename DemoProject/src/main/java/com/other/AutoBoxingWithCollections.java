package com.other;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingWithCollections {

	public static void main(String[] args) {
		List myList=new ArrayList();
		myList.add(new Integer(42));
		System.out.println(myList);
		
		Integer y=new Integer(35);
		int x=y.intValue();  //unwrap it
		x++;
		y=new Integer(x);    //wrap it
		System.out.println("y ="+y);
		
		Integer y1=new Integer(678);
		y1++;
		System.out.println("y1 is"+y1);
		
		Integer a=456;
		Integer b=a;
		System.out.println(a==b);
		a++;
		System.out.println(a);
		System.out.println(a==b);
	}

}
